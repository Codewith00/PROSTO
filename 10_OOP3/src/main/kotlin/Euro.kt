class Euro(override val currencyCode: String = "EUR") :CurrencyConverter {

    override fun convertToRub(current: Int): Int {
        return current * 70
    }
}