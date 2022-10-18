class PromoCreditCard(balance: Double, bonus: Double, creditBalance: Double, name: String) :
    CreditCard(balance, bonus, creditBalance, name) {
   private var itBalance = balance
    private var itCreditBalance = creditBalance
    override fun pay(current: Double): Boolean {
        return if (itBalance <= current) {
            if (itBalance + itCreditBalance <= current) {
                println("Not enough money")
                false
            } else {
                itCreditBalance -= (current - itBalance)
                itBalance = 0.0
                if (current >= 5000.0) itBalance += (current / 10)
                true
            }
        } else {
            itBalance -= current
            if (current >= 5000.0) itBalance += (current / 10)
            true
        }
    }
}
//  ›ÿ¡›  Õ¿ ¡¿À¿Õ— œ–» œŒ ”œ ≈ Œ“ 5000