package tutorial5
import scala.io.StdIn

object q3 {

  def sum(n: Int): Int = n match {
    case 0 => 0
    case _ => n + sum(n - 1)

  }

  def main(args: Array[String]): Unit = {
    println("Enter any number ")
    val n = StdIn.readInt()
    print("Sum : " + sum(n))
  }

}
