import org.scalajs.linker.interface.ModuleSplitStyle

ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "3.6.2"

lazy val organizationSettings = Seq(
  organization := "fdraft"
)

lazy val commonJvmSettings = Seq(
  scalacOptions ++= Seq(
    "-unchecked",
    "-Xfatal-warnings"
  )
)

lazy val front = project
  .enablePlugins(ScalaJSPlugin)
  .dependsOn(shared.js)
  .aggregate(shared.js)
  .settings(organizationSettings *)
  .settings(
    name := "f-draft-front",
    scalaJSUseMainModuleInitializer := true,
    scalaJSLinkerConfig ~= {
      _.withModuleKind(ModuleKind.ESModule)
        .withModuleSplitStyle(ModuleSplitStyle.SmallModulesFor(List("front")))
    },
    libraryDependencies ++= Seq(
      "org.scala-js" %%% "scalajs-dom" % "2.8.0",
      "com.raquo" %%% "laminar" % "17.2.0",
      "io.circe" %%% "circe-core" % "0.14.10",
      "io.circe" %%% "circe-generic" % "0.14.10",
      "io.circe" %%% "circe-parser" % "0.14.10"
    )
  )

lazy val back = project
  .dependsOn(shared.jvm)
  .aggregate(shared.jvm)
  .settings(organizationSettings *)
  .settings(commonJvmSettings *)
  .settings(
    name := "f-draft-back",
    libraryDependencies ++= Seq(
      "com.softwaremill.sttp.tapir" %% "tapir-core" % "1.11.11"
    )
  )

lazy val shared = crossProject(JSPlatform, JVMPlatform)
  .crossType(CrossType.Pure)
  .settings(organizationSettings *)
  .settings(
    name := "f-draft-shared",
    libraryDependencies ++= Seq(
      "com.lihaoyi" %%% "upickle" % "4.1.0",
      "com.lihaoyi" %%% "ujson" % "4.1.0"
    )
  )
  .jvmSettings(commonJvmSettings *)
  .jvmSettings(
    libraryDependencies += "org.scala-js" %% "scalajs-stubs" % "1.1.0" % "provided"
  )
