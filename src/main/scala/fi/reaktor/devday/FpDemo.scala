package intro 

abstract class Fruit {
  val weight: Int
}
case class Orange(weight: Int, diameter: Double) extends Fruit
case class Banana(weight: Int, curvature: Double) extends Fruit

object FpDemo {
  def describe(fruit: Fruit): String = fruit match {
    case Orange(w, d) => "This orange weighs " + w + " and has a: " + d + " diameter"
    case Banana(_, c) => "Don't care about the weight but look at the " + c + " curvature on this banana!"
    case f: Fruit => "No idea about this but it weighs: " + f.weight
  }
  
  def main(args: Array[String]) {
    println(describe(Orange(300, 3)))
    println(describe(Banana(200, 0.76)))
    println(describe(new Fruit { val weight = 20 }))
  }
}

object Hof {
  def hof(args: Array[String]): Unit = { 
    val list = List(2, 3, 4)
    list.map { n => n + 1}
    val addOne = (n: Int) => n + 1    
    list.map(addOne)
    list.map (_ + 1)

    val f = (a: Int, b: Int) => a + b        
    list.foreach(n => println(n))
    list.foreach(println(_))
    list.foreach(println)
    list.filter(_ < 3)
    list.reduceLeft(f)
    list.foldLeft(0)(f)
    list.foldLeft(0)(_ + _)  
  }
}