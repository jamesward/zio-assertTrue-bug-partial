scalaVersion := "3.3.1"

libraryDependencies ++= Seq(
  "dev.zio" %% "zio"        % "2.0.20",
  "dev.zio" %% "zio-http"   % "3.0.0-RC4",

  "dev.zio" %% "zio-test"     % "2.0.20" % Test,
  "dev.zio" %% "zio-test-sbt" % "2.0.20" % Test,
)

scalacOptions := Seq(
  "-Wunused:locals",
  "-Xfatal-warnings",
)
