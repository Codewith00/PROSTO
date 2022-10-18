open class CreditCard(
    override var balance: Double, override var bonus: Double, open var creditBalance: Double,
    override var name: String
) :
    BankCard() {


    override fun upBalance(current: Double) {
        if (creditBalance == 10000.0)
            balance += current
        else
            if (current + creditBalance > 10000.0) {
                balance += (current + creditBalance) - 10000.0
                creditBalance = 10000.0
            } else creditBalance += current

    }

    override fun pay(current: Double): Boolean {
        return if (balance <= current) {
            if (balance + creditBalance <= current) {
                println("Not enough money")
                false
            } else {
                creditBalance -= (current - balance)
                balance = 0.0
                true
            }
        } else {
            balance -= current
            true
        }


    }

    override fun takeBalance(): Double {
        return balance
    }

    override fun informCount() {
        println("$name - Credit card balance: Debit balance - $balance, Credit balance - $creditBalance, bonus balance - $bonus")
    }

    override fun cashBackPay(current: Double): Boolean {
        return if (balance <= current) {
            if (balance + creditBalance <= current) {
                println("Not enough money")
                false
            } else {
                creditBalance -= (current - balance)
                balance = 0.0
                bonus += (current * 0.01)
                true
            }
        } else {
            balance -= current
            bonus += (current * 0.01)
            true
        }


    }
}


