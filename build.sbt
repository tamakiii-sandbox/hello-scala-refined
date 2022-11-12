lazy val root = project
  .in(file("."))
  .settings(
    name := ".",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := "2.13.10",

    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test,
    libraryDependencies ++= Seq(
      "eu.timepit" %% "refined" % "0.10.1"
      // "eu.timepit" %% "refined-cats"            % "0.10.1", // optional
      // "eu.timepit" %% "refined-eval"            % "0.10.1", // optional, JVM-only
      // "eu.timepit" %% "refined-jsonpath"        % "0.10.1", // optional, JVM-only
      // "eu.timepit" %% "refined-pureconfig"      % "0.10.1", // optional, JVM-only
      // "eu.timepit" %% "refined-scalacheck"      % "0.10.1", // optional
      // "eu.timepit" %% "refined-scalaz"          % "0.10.1", // optional
      // "eu.timepit" %% "refined-scodec"          % "0.10.1", // optional
      // "eu.timepit" %% "refined-scopt"           % "0.10.1", // optional
      // "eu.timepit" %% "refined-shapeless"       % "0.10.1"  // optional
    )
  )
