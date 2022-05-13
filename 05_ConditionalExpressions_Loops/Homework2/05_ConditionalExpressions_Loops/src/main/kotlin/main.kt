fun main() {
    val n = come(readLine()?.toIntOrNull()!!)
    var t1: Long = 0
    var t2: Long = 1
    for (j in 1..n) {
        val sum = t1 + t2
        t1 = t2
        t2 = sum
    }
    print("The number in the position $n of the Fibanachi : $t1")
}

fun come(b: Int): Int {

    while ( b < 1) {
        println("You must enter a numeric value greater than zero!")
        return come(readLine()?.toIntOrNull()!!)
    }
    return b
}