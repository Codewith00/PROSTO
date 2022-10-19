class PromoCreditCard(balance: Double, bonus: Double, creditBalance: Double, name: String) :
    CreditCard(balance, bonus, creditBalance, name) {
    override fun pay(current: Double): Boolean {
        if (super.pay(current)) addCashBack(current)
        return true
    }
        private fun addCashBack(current: Double) {
            balance += (current / 10)
        }

}
//  ›ÿ¡›  10% Õ¿ ¡¿À¿Õ— œ–» œŒ ”œ ≈ Œ“ 5000