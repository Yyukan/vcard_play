name := """vcard-play-2_3"""

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  "org.webjars" %% "webjars-play" % "2.3.0-3",
  "org.webjars" % "jquery" % "2.1.3",
  "org.webjars" % "font-awesome" % "4.3.0-2",
  "org.webjars" % "bootstrap" % "3.3.4"
)

lazy val root = (project in file(".")).enablePlugins(PlayScala)


fork in run := false