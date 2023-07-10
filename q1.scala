package tutorial5
import scala.io.StdIn

object q1 {
  def prime(n: Int, i: Int = 2): Boolean = n match {
    case 1 => false
    case x if (x == i) => true
    case x if (x % i == 0) => false
    case _ => prime(n, i + 1)
  }

  def main(args: Array[String]): Unit = {
    print("Enter your number ")
    val num = StdIn.readInt()
    println(prime(num))
  }

}
