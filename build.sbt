name := """multi-project-sample"""

scalaVersion := "2.12.3"

lazy val root = project

lazy val admin = project.enablePlugins(PlayScala).aggregate(common).dependsOn(common)

lazy val web_api = project.enablePlugins(PlayScala).aggregate(common).dependsOn(common)

lazy val common = project
