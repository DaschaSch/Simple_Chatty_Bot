fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()

    for (i in a..b) {
        if (i % 5 == 0 && i % 3 == 0) {
            println("FizzBuzz")
        } else if (i % 5 == 0 && i % 3 != 0) {
            println("Buzz")
        } else if (i % 5 != 0 && i % 3 == 0) {
            println("Fizz")
        } else {
            println(i)
        }
    }
}
