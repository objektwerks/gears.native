import scalanative.build.Mode

enablePlugins(ScalaNativePlugin)

name := "gears.native"
organization := "objektwerks"
version := "0.2-SNAPSHOT"
scalaVersion := "3.8.2-RC3"
libraryDependencies ++= {
  Seq(
    "ch.epfl.lamp" %%% "gears" % "0.2.0",
    "com.softwaremill.sttp.client4" %%% "core" % "4.0.18",
    "com.lihaoyi" %%% "ujson" % "4.4.2"
  )
}
scalacOptions ++= Seq(
  "-Wunused:all"
)
nativeConfig ~= {
  _.withMode(Mode.releaseFast)
}
