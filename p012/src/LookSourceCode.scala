object LookSourceCode {
  def main(args: Array[String]): Unit = {
    val arr = new Array[Int](10)
    println("arr=" + arr.toString)
    for (elem <- arr) {
      println("elem=" + elem)
    }
  }
}
