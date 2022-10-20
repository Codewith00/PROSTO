object Converters {

    private val currList = listOf<CurrencyConverter>(Dollar(), Euro())

    fun get(currencyCode: String): CurrencyConverter{
        return currList.find {it.currencyCode == currencyCode} ?: object : CurrencyConverter {
            override val currencyCode: String
                get() = "NOT VALUE"

            override fun convertToRub(current: Int): Int {
                print("unknown currency ")
                return 0
            }

        }
    }
}