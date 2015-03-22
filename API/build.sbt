name := """tamahiyo-API"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
//  jdbc,
//  anorm,
//  cache,
//  ws,
  "com.typesafe.play" %% "play-slick" % "0.8.1",
  "org.sisioh" % "scala-dddbase-core_2.10" % "0.1.29"
)


fork in run := true