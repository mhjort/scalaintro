package intro

sealed abstract class Expr
case class Number(value: Double) extends Expr
case class UnOp(operator: String, expr: Expr) extends Expr
case class BinOp(operator: String, left: Expr, right: Expr) extends Expr

object FpCalculator {
  def eval(expr: Expr): Double = expr match {
    case Number(x) => x
    case BinOp("+", x, y) => eval(x) + eval(y)
    case BinOp("-", x, y) => eval(x) - eval(y)
    case BinOp("*", x, y) => eval(x) * eval(y)
    case BinOp("/", x, y) => eval(x) / eval(y)
    case UnOp("^2", x) => eval(x) * eval(x)
    case op => throw new UnsupportedOperationException(op + " not supported")
  }

  def main(args: Array[String]): Unit = {     
    val step1 = BinOp("+", Number(2), Number(3))
    val step2 = BinOp("*", step1, Number(4))
    val step3 = BinOp("/", step2, Number(5))
    val step4 = UnOp("^2", step3)
    println(eval(step4))
    val squareSum = (1 to 100).map { x => UnOp("^2", Number(x))}.map(eval).reduceLeft(_ + _)
    println(squareSum)
  }
}
