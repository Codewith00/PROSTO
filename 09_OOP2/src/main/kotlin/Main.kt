import kotlin.random.Random
import kotlin.random.Random.Default.nextDouble

fun main() {
    val sberbank = DebitCard(balance = 50054.60, bonus = 0.0, name = "SBER")
    val sovkombank = CreditCard(balance = 0.0, bonus = 0.0, creditBalance = 159.0, name = "SOVKOM")
    val alfabank = PromoDebitCard(0.0, 12.0, "ALFA")
    val qivi = PromoCreditCard(1000.0, 0.0, 50.0, "QIWI")

    while (sberbank.takeBalance() > 1000) {
        println(sberbank.informCount())
        if (!sberbank.pay(10000.0)) break
    }
    while (sovkombank.takeBalance() < 2000) {
        sovkombank.upBalance(2999.9)
        println(sovkombank.informCount())
    }
println(alfabank.informCount())
    for (j in 1..10)
        when (Random.nextBoolean()) {
            true -> {
                if (!alfabank.pay(nextDouble(300.0, 5000.0))) println("No money!")
                println(alfabank.informCount())
            }
            false -> {
                alfabank.upBalance(nextDouble(100.0, 2000.0))
                println(alfabank.informCount())
            }
        }

    for (j in 1..10)
        when (Random.nextBoolean()) {
            true -> {
                qivi.pay(nextDouble(300.0, 5000.0))
                println(qivi.informCount())
            }
            false -> {
                qivi.upBalance(nextDouble(100.0, 2000.0))
                println(qivi.informCount())
            }
        }

}