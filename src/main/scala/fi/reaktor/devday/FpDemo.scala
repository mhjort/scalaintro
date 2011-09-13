package fi.reaktor.devday

abstract class Fruit {
  val weight: Int
}
case class Orange(weight: Int, diameter: Double) extends Fruit
case class Banana(weight: Int, curvature: Double) extends Fruit

object FpDemo {
  def describe(fruit: Fruit): String = fruit match {
    case Orange(w, d) => "This orange weighs " + w + " and has a: " + d + " diameter"
    case Banana(_, c) => "Don't care about the weight but look at the " + c + "curvature on this banana!"
    case f: Fruit => "No idea about this but it weighs: " + f.weight
  }

  def hof(args: Array[String]): Unit = {
    val list = List(2, 3, 4)
    list.map { n => n + 1 }
    val addOne = (n: Int) => n + 1
    list.map(addOne)
    list.map(_ + 1)

    val f = (a: Int, b: Int) => a + b
    list.foreach(n => println(n))
    list.foreach(println(_))
    list.foreach(println)
    list.filter(_ < 3)
    list.reduceLeft(f)
    list.foldLeft(0)(f)
    list.foldLeft(0)(_ + _)

    // TODO: example of recursion
  }
}

// TALKING POINTS
// Case class: factory method, parameters are vals automatically, toString/hashCode/equals implemented, copy method
  // Often used to form to use recursive data structures processed using PATTERN MATCHING
// Pattern matching looks like a generalized switch/case, but its' main use is processing recursive data types
  // The case statements can be based on many things. The examples are a powerful device called 
  // constructor patterns, matching recursively against certain patterns of case class constructors
  // using for example wildcards and parameter binding
// Function literals
// Lists (and other sequences), higher-order functions
