fun main() {
    var i = readLine()!!.toInt()
    var sum = 0
    while(i > 0) {
        sum += i
        i = readLine()!!.toInt()
    }
    println(sum)
}