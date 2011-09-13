package fi.reaktor.devday

sealed abstract class Shape
case class Square(width: Int, height: Int) extends Shape
case class Circle(radius: Int) extends Shape

object FpDemo2 {
  def describe(a: Any): String = {
    a match {
      case Square(0, _) => "Zero width square"
      case Square(_, height) => "Square with height " + height
      case c: Circle => "Circle with radius" + c.radius
      case a => a.toString
    }
  }

  def main(args: Array[String]): Unit = {
    println(describe(Square(2, 3)))
    println(describe(Square(0, 3)))
  }
}
