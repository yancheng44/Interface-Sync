name := "Interface-Sync"

version := "1.0"

scalaVersion := "2.12.2"

resolvers += "Typesafe Releases" at "http://maven.aliyun.com/nexus/content/groups/public/"

libraryDependencies ++= Seq(
  "com.typesafe.slick" %% "slick" % "3.2.0",
  "org.slf4j" % "slf4j-nop" % "1.6.4",
  "com.typesafe.slick" %% "slick-hikaricp" % "3.2.0"
)







