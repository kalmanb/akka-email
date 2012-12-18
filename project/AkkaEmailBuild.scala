import sbt._
import sbt.Keys._

object AkkaEmailBuild extends Build {

  lazy val akkaEmail = Project(
    id = "akka-email",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "Akka Email",
      organization := "com.sosnoski.akka.email",
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.9.2",
      resolvers += "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases",
      libraryDependencies += "com.typesafe.akka" % "akka-actor" % "2.0.1"
    )
  )
}
