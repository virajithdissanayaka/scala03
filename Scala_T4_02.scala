object Scala_T4_02 {
  def main(args: Array[String]):Unit={
    val n = args(0).toInt
    PatternMatching(n)
  }
  def PatternMatching(number: Int): Unit = {
    println()
    println(numberChecker(number))
  }
  def numberChecker(number: Int): String = number match {
    case n if number <= 0 =>
      return "Negetive/Zero input"
    case n if number % 2 == 0 =>
      return "Even Number is Given"
    case n if number % 2 == 1 =>
      return "Odd number is given"
  }
}
