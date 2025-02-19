import org.scalajs.linker.interface.ModuleSplitStyle

ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "3.6.2"

def projectWithShared(p: Project): Project = p.dependsOn(shared).aggregate(shared)

lazy val front = projectWithShared(project)
  .enablePlugins(ScalaJSPlugin)
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

lazy val back = projectWithShared(project)
  .settings(
    name := "f-draft-back",
    libraryDependencies ++= Seq(
      "com.softwaremill.sttp.tapir" %% "tapir-core" % "1.11.11"
    )
  )

lazy val shared = project
  .settings(
    name := "f-draft-shared"
  )