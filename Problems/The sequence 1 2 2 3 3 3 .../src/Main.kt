fun main() {
    val n  = readLine()!!.toInt()
    var iteration = 0
    var amountOfNr = 0

    while (iteration < n) {
        iteration++

        for (i in 1..iteration) {
            if (amountOfNr < n) {
                print("$iteration ")
                amountOfNr++
            }
        }
    }
}