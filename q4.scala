package tutorial5

import scala.io.StdIn

object q4 {

  def checkEven(n: Int): String = n match {
    case n if (n == 0) => "Even number"
    case n if (n == 1) => "Odd number"
    case n if (n < 0) => checkEven(n+2)
    case _ => checkEven(n - 2)
  }

  def main(args: Array[String]): Unit = {
    println("Enter your number ")
    val n = StdIn.readInt()
    print("Your number -> " + checkEven(n))
  }

}
