interface CurrencyConverter {
    val currencyCode: String
    fun convertToRub(current: Int) : Int
}