class PromoDebitCard(balance: Double, bonus: Double, name: String) : DebitCard(balance, bonus, name) {
    override fun upBalance(current: Double) {
        super.upBalance(current * 1.005)
    }

    override fun pay(current: Double): Boolean {
        if (super.pay(current)) {
            bonus += (current * 0.01)
            return true
        }
        return false
    }
}
// +1% áîíóñ çà êàæäóş ïîêóïêó
// +0.5% ÍÀ ÁÀËÀÍÑ ÇÀ ÊÀÆÄÎÅ ÏÎÏÎËÍÅÍÈÅ