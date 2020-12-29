object PrintDemo {

  def main(args: Array[String]): Unit = {
    var str1 = "hello"
    var str2 = " world"
    println(str1 + str2)
    val name = "tom"
    val age = 10
    val sal = 10.67f
    val height = 192.2

    // 类似C语言输出
    printf("名字=%s, 年龄=%d, 薪水=%.2f, 身高=%.3f\n", name, age, sal, height)

    // 类似PHP语言输出
    println(s"名字=$name, 年龄=${age + 10}, 薪水=$sal, 身高=$height")
  }
}
