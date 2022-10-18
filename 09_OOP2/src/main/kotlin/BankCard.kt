abstract class BankCard() {
    protected abstract var name: String
    protected abstract var balance: Double
    protected abstract var bonus: Double
    abstract fun upBalance(current: Double)
    abstract fun pay(current: Double):Boolean
    abstract fun takeBalance(): Double
    abstract fun informCount()
    abstract fun cashBackPay(current: Double):Boolean  //PROMO cashback 1%
}
