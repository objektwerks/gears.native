import scalanative.build.Mode

enablePlugins(ScalaNativePlugin)

name := "gears.native"
organization := "objektwerks"
version := "0.2-SNAPSHOT"
scalaVersion := "3.6.2"
libraryDependencies ++= {
  Seq(
    "ch.epfl.lamp" %%% "gears" % "0.2.0",
    "com.softwaremill.sttp.client4" %%% "core" % "4.0.0-M19",
    "com.lihaoyi" %%% "ujson" % "4.0.2"
  )
}
scalacOptions ++= Seq(
  "-Wall"
)
nativeConfig ~= {
  _.withMode(Mode.releaseFast)
}
