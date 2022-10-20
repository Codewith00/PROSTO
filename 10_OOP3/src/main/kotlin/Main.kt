fun main() {
    val dollars = Converters.get("USD") // ���� 60
    val euro = Converters.get("EUR")    // ���� 70
    val unknown = Converters.get("YAU")

    printInfo(2000, euro)
    printInfo(400, dollars)
    printInfo(999, unknown)

}

fun printInfo(value: Int, current: CurrencyConverter) {
    println("${current.convertToRub(value)} - RUB = $value - ${current.currencyCode}")
}