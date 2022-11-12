import eu.timepit.refined.api.Refined
import eu.timepit.refined.auto._
import eu.timepit.refined.numeric.Positive

object Main extends App {
  val i1: Int Refined Positive = 5
  // val i2: Int Refined Positive = -5
  // // [error] /work/src/main/scala/Main.scala:7:34: Predicate failed: (-5 > 0).
  // // [error]   val i2: Int Refined Positive = -5
  // // [error]                                  ^
  // // [error] one error found
  // // [error] (Compile / compileIncremental) Compilation failed
  // // [error] Total time: 3 s, completed Nov 11, 2022, 11:49:02 AM
  println("Hello, World!")
}

// @main def hello: Unit = 
//   println("Hello world!")
//   println(msg)
//
// def msg = "I was compiled by Scala 3. :)"
