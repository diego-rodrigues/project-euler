ThisBuild / scalaVersion     := "2.13.1"
ThisBuild / version          := "1.0.0"
ThisBuild / organization     := "com.marionete"
ThisBuild / organizationName := "Diego Rodrigues"

lazy val dependencies = Seq(
  "org.scalatest" %% "scalatest" % "3.2.0-M2" % Test
)

lazy val root = (project in file("."))
  .settings(
    mainClass in (Compile, packageBin) := Some("com.marionete.euler.Main"),
    name := "Project Euler Challenges",
    libraryDependencies ++= dependencies
  )

