object Scala_T4_01 {
  def main(args: Array[String]): Unit = {
    println("Enter the deposit amount: ")

    val x = scala.io.StdIn.readInt()

    var totalInterest: Double = calcinterest(x)
    print("Total interest is: " + totalInterest);
  }

  def calcinterest(ammount: Int): Double = {


    if (ammount <= 20000) {
      val rate = 2
      var interest = ammount * (rate) / 100
      return interest: Double
    }
    else if (ammount <= 200000) {
      val rate = 4
      var interest = ammount * (rate) / 100
      return interest: Double
    }
    else if (ammount <= 2000000) {
      val rate = 3.5
      var interest = ammount * (rate) / 100
      return interest: Double
    }
    else {
      val rate: Double = 6.5
      var interest: Double = ammount * (rate) / 100
      return interest: Double
    }

  }
}
