import java.util.Scanner

fun main() {
    val n = readLine()!!.toInt()
    val scan = Scanner(System.`in`)
    var minValue = scan.nextInt()

        repeat(n - 1) {
        val nr = scan.nextInt()
        for (i in 1..n) {
            if (nr < minValue) {
                minValue = nr
            }
        }
    }

    println(minValue)
}
