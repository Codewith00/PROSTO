class Dollar(override val currencyCode: String = "USD") : CurrencyConverter {

    override fun convertToRub(current: Int): Int {
        return current * 60
    }
}