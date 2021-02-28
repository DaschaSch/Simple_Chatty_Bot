fun main() {
    val num1 = readLine()!!.toInt()
    val num2 = readLine()!!.toInt()
    val num3 = readLine()!!.toInt()

    if ((num1 > 0 && (num2 <= 0 && num3 <=0 )) || (num2 > 0 && (num1 <= 0 && num3 <= 0)) || (num3 > 0 && (num2 <= 0 && num1 <= 0))) {
        println("true")
    } else {
        println("false")
    }
}
