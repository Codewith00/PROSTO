open class DebitCard(override var balance: Double, override var bonus: Double, override var name: String) : BankCard() {

    override fun upBalance(current: Double) {
        balance += current
    }

    override fun pay(current: Double): Boolean {
        return if (balance < current) {
            println("Not enough money")
            false
        } else {
            balance -= current
            true
        }
    }

    override fun takeBalance(): Double {
        return balance
    }

    override fun informCount() {
        println("$name - Credit card balance: Debit balance - $balance, bonus balance - $bonus")
    }

    override fun cashBackPay(current: Double): Boolean {
        return if (balance < current) {
            println("Not enough money")
            false
        } else {
            balance -= current
            bonus += (current * 0.01)
            true
        }

    }

}

