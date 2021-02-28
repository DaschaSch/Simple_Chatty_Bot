fun main() {
    val n = readLine()!!.toInt()
    var d = 0
    var c = 0
    var b = 0
    var a = 0

    repeat(n) {
        val mark = readLine()!!.toInt()
        if (mark == 2) {
            d += 1
        } else if (mark == 3) {
            c += 1
        } else if (mark == 4) {
            b += 1
        } else if (mark == 5) {
            a += 1
        }
    }

    println("" + d + " " + c + " " + b + " " + a)
}