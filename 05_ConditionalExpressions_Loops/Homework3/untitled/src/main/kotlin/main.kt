

fun main() {
    val list = mutableListOf<Int>(1,2,3,4,5)
    val carList = listOf("Mers", "BMW", "Volga")

    println(list.joinToString(", "))
    println(carList.joinToString(" Love "))


}
