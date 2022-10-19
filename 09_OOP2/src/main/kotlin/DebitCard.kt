
open class DebitCard(override var balance: Double,
                     override var bonus: Double,
                     override var name: String) : BankCard() {

    override fun upBalance(current: Double) {
        balance += current

    }

    override fun pay(current: Double): Boolean {
        return if (balance < current) {
            false
        } else {
            balance -= current
            true
        }
    }

    override fun takeBalance(): Double {
        return balance
    }

    override fun informCount(): String {
        return "$name - Debit balance - ${String.format("%.2f", balance)}, Bonus balance - ${String.format("%.2f", bonus)}"

    }
}

