fun main() {
    val n = readLine()!!.toInt()
    var amountOfPositiveNr = 0

    repeat(n) {
        val nr = readLine()!!.toInt()
        if (nr > 0) {
            amountOfPositiveNr += 1
        }
    }

    print(amountOfPositiveNr)
}
