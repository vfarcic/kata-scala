name := "kata-scala"

version := "1.0"

libraryDependencies ++= {
  var specsV2 = "2.3.12"
  Seq(
    "org.specs2"    %% "specs2-core"  % specsV2   % "test",
    "org.specs2"    %% "specs2-mock"  % specsV2   % "test"
  )
}
    