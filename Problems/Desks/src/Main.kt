fun main() {
    val firstNr = readLine()!!.toInt()
    val secondNr = readLine()!!.toInt()
    val thirdNr = readLine()!!.toInt()
    val sum = firstNr / 2 + secondNr / 2 + thirdNr / 2 + (firstNr % 2 + secondNr % 2 + thirdNr % 2)
    println(sum)
}
