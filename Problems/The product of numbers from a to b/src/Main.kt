fun main() {
    val a = readLine()!!.toLong()
    val b = readLine()!!.toLong()
    var result: Long = 1;

    for(i in a until b){
        //val next = a+1
        //if(next < b){
            result *= i
        //}
    }
    println(result)
}