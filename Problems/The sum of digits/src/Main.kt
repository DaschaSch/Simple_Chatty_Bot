import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)
    val nr = scan.nextInt()
    val firstNr = nr / 100
    val secondNr = (nr - firstNr * 100) / 10
    val thirdNr = nr - firstNr * 100 - secondNr * 10
    val sum = firstNr + secondNr + thirdNr
    println(sum)

}
