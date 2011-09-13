package fi.reaktor.devday

class HelloWorld(val greeting: String) {
  def sayHello(names: Array[String]): Unit = {
    if (names.length == 0) {
      println("Hello unknown!")
    } else {
      // imperative while
      var i = 0
      while (i < names.length) {
        println(greeting + ", " + names(i) + "!")
        i += 1
      }
    }
  }
}

object HelloWorld {
  def main(args: Array[String]): Unit = {
    new HelloWorld("Hello").sayHello(args)
  }
}

// Talking points
// 1. Console application, in Java a static method of a class, in Scala a singleton object
// -Function definition: def, optional parameter list, optional return type, body, procedure vs function (=)
// -Class definition: functions (def), immutable state (val), mutable state (var)
// -Console printing: println
// -If-else
// While loop
// List.length & Array.length no difference (compare to Java length & size())
// -Type inference: i

