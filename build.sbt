name := "test-flyway"
version := "0.0.1-SNAPSHOT"

scalaVersion := "2.12.7"

scalacOptions ++= Seq(
  "-encoding", "UTF-8",   // source files are in UTF-8
  "-deprecation",         // warn about use of deprecated APIs
  "-unchecked",           // warn about unchecked type parameters
  "-feature",             // warn about misused language features
  "-language:higherKinds",// allow higher kinded types without `import scala.language.higherKinds`
  "-Xlint",               // enable handy linter warnings
  "-Xfatal-warnings",     // turn compiler warnings into errors
  "-Ypartial-unification" // allow the compiler to unify type constructors of different arities
)

enablePlugins(FlywayPlugin)

libraryDependencies += "org.typelevel" %% "cats-core" % "1.4.0"
libraryDependencies += "org.hsqldb" % "hsqldb" % "2.4.0"

flywayUrl := "jdbc:hsqldb:file:target/testdb;shutdown=true"
flywayUser := "postgres"
flywayLocations += "db/migration"
flywayTable := "schema_history"
flywayDriver := "org.hsqldb.jdbcDriver"

flywaySchemas := Seq("public")

//flywaySqlMigrationPrefix := "Migration-"


flywaySqlMigrationSeparator := "__"

//flywayEncoding := "ISO-8859-1"

//flywayPlaceholderReplacement := true
//
//flywayPlaceholders := Map(
//  "aplaceholder" -> "value",
//  "otherplaceholder" -> "value123"
//)
//
//flywayPlaceholderPrefix := "#["
//
//flywayPlaceholderSuffix := "]"

flywayTarget := "1.1"

flywayOutOfOrder := false



//enablePlugins(FlywayPlugin)
//name := "plugtest"
//version := "0.0.1"
//name := "flyway-sbt-test1"
//
//
//flywayUrl := "jdbc:hsqldb:file:target/flyway_sample;shutdown=true"
//flywayUser := "SA"
//flywayPassword := ""
//flywayLocations += "db/migration"
//flywayUrl in Test := "jdbc:hsqldb:file:target/flyway_sample;shutdown=true"
//flywayUser in Test := "SA"
//flywayPassword in Test := ""
