package tutorial5
import scala.io.StdIn

object q5 {

  def checkEven(n: Int): Boolean = n match {
    case n if (n == 0) => true
    case n if (n == 1) => false
    case _ => checkEven(n - 2)
  }

  def sum(n: Int): Int = n match {
    case n if (n == 0) => 0
    case n if checkEven(n) => n + sum(n - 2)
    case _ => sum(n - 1)
  }

  def main(args: Array[String]): Unit = {
    println("Enter your number ")
    val n = StdIn.readInt()
    print("Sum ->  " + sum(n - 1))
  }

}
