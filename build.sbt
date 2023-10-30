scalaVersion := "3.3.1"

libraryDependencies ++= Seq(
  "dev.zio" %% "zio"        % "2.0.18",
  "dev.zio" %% "zio-http"   % "3.0.0-RC3",

  "dev.zio" %% "zio-test"     % "2.0.18" % Test,
  "dev.zio" %% "zio-test-sbt" % "2.0.18" % Test,
)

scalacOptions := Seq(
  "-Wunused:locals",
  "-Xfatal-warnings",
)
