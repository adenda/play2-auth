// The Typesafe repository
resolvers ++= Seq(
  "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/",
  "Typesafe Snapshots repository" at "http://repo.typesafe.com/typesafe/snapshots/"
)

// Use the Play sbt plugin for Play projects
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.6.0")
addSbtPlugin("org.foundweekends" % "sbt-bintray" % "0.5.1")

scalacOptions ++= Seq("-deprecation", "-unchecked", "-language:_")

