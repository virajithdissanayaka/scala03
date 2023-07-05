object Scala_T4_03 {
  def main(args:Array[String]): Unit = {
    formatter()
  }

  def formatter(): Unit = {
    println(formatNames("Benny")(toUpper))
    println(formatNames("Ni")(toUpper) + "roshan")
    println(formatNames("Saman")(toLower))
    println("Kumar" + formatNames("a")(toUpper))
  }

  def toUpper(str:String): String = str.toUpperCase()

  def toLower(str:String): String = str.toLowerCase()

  def formatNames(name:String)(formatName: String => String): String = formatName(name)

}