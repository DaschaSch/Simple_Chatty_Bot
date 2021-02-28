import java.util.Scanner

fun main() {
    val n = readLine()!!.toInt()
    val scan = Scanner(System.`in`)
    val maxPairweiseProduct : Int
    var a = 0
    var b = 0
    if (n == 1){
        maxPairweiseProduct = scan.nextInt()
    }
    else {
        for (i in 1..n) {
            var number = scan.nextInt()
            if (number > a) {
                b = a
                a = number
            }
            else if (b< number && number <= a){
                b = number
            }
        }
        maxPairweiseProduct = a*b
    }
    println(maxPairweiseProduct)
}