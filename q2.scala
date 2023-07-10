package tutorial5
import scala.io.StdIn

object q2 {
  def prime(n: Int, i: Int = 2): Boolean = n match {
    case 1 => false
    case x if (x == i) => true
    case x if (x % i == 0) => false
    case _ => prime(n, i + 1)
  }

  def primeSeq(n: Int): Unit = {
    if (n == 2) {
      print(n)
    }
    else {
      primeSeq(n - 1)
      if (prime(n))
        print("," + n)
    }

  }

  def main(args: Array[String]): Unit = {
    println("Enter your number ")
    val n = StdIn.readInt()
    print("prime numbers : ")
    primeSeq(n - 1)
  }


}
