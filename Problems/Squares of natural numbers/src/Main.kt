fun square(a: Int) = a * a

fun main() {
    val max = readLine()!!.toInt()
    var i = 1
    while (square(i) <= max) {
        println(square(i))
        i++
    }
}