import java.util.*

fun main() {
    val n = readLine()!!.toInt()
    var counter = 0
    var maxCounter = 0
    val scan = Scanner(System.`in`)
    var firstValue = scan.nextInt()

    for (i in 1..(n - 1)) {
        val nextValue = scan.nextInt()
        if (i <= nextValue){
            counter++
        } else {
            maxCounter = counter
            counter = 0
        }
    }
    println(maxCounter)
}