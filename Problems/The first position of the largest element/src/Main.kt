import java.util.*

fun main() {

    val scan = Scanner(System.`in`)
    var max = scan.nextInt()
    var position = 1
    // var isNr = scan.hasNextInt()
    var iteration = 1

    while (scan.hasNextInt()) {
        val nr = scan.nextInt()
        if (nr > max) {
            max = nr
            iteration++
            position = iteration
        } else {
            iteration++
        }
    }
    println(max.toString() + " " + position.toString())
}