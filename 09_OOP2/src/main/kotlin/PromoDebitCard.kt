class PromoDebitCard(balance: Double, bonus: Double, name: String) : DebitCard(balance, bonus, name) {
    var itBalance = balance
    override fun upBalance(current: Double) {
        itBalance += (current * 1.005)
    }
}
// +0.5% мю аюкюмя гю йюфдне ононкмемхе