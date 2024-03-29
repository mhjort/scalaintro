package fi.reaktor.devday

class Calculator {
  private var value = 0.0
  def add(amount: Double): Double = {
    value = value + amount
    return value
  }
  def minus(amount: Double): Double = {
    value -= amount
    return value
  }
  def multiply(amount: Double): Double = {
    value *= amount
    return value
  }
  def square(): Double = {
    value *= value
    return value
  }
  def divide(amount: Double): Double = {
    if (amount == 0) throw new IllegalArgumentException("Division by zero")
    value = value / amount
    return value
  }
  def reset(v: Double) = {
    value = v
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val c = new Calculator
    c.add(2)
    c.add(3)
    c.multiply(4)
    c.divide(5)
    println(c.square())
    var i = 1;
    var sum = 0.0
    while (i <= 100) {
      c.reset(i)
      sum += c.square()
      i += 1
    }
    println(sum)
  }
}
