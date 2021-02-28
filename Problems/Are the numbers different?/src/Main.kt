fun main() {
    val num1 = readLine()!!.toInt()
    val num2 = readLine()!!.toInt()
    val num3 = readLine()!!.toInt()
    // val areEqual = num1 == num2 == num3
    
    if (num1 == num2 || num2 == num3 || num1 == num3) {
        println("false")
    } else {
        println("true")
    }
}
