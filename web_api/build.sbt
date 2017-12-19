name := """web_api"""
organization := "com.tky"

version := "1.0-SNAPSHOT"

lazy val web_api = (project in file(".")).enablePlugins(PlayScala).dependsOn(common)

lazy val common = project.in(file("../common"))

scalaVersion := "2.12.3"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test

PlayKeys.devSettings := Seq("play.server.http.port" -> "9001")

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.tky.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.tky.binders._"
