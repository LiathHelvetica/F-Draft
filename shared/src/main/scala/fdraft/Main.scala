package fdraft

import ujson.*

import scala.io.Source
import scala.util.Using

object Main extends App {

  Using(Source.fromResource("lol-champions-15-4-1.json"))(source => {
    val str = source.getLines().mkString
    val json: Value = ujson.read(str)
    val championData = json("data")
    val a =
      for {
        (key, champ) <- championData.obj
      } yield println(
        f"case ${champ("id").str} => ChampionBasicInfo(${champ("id").str}, ${champ("name")}, Set(${champ("tags").arr.toSeq.map(_.str).mkString(", ")}))"
      )
  })

}
