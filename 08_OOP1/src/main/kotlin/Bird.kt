import kotlin.random.Random
import kotlin.random.nextInt

open class Bird(name: String, maxOld: Int, weight: Int, energy: Int) : NatureReserve(name, maxOld, weight, energy) {

    override fun move():Boolean {
        itEnergy -= 5
        itWeight -= 1
        if (tryIncrementAge()) old++
        return if (itEnergy > 4 && itWeight > 0 && isTooOld(old)) {
            println("$itName - FLY")
            when (Random.nextInt(1..5)){              //Шанс рождения 20%
                3 -> println(offSpring())
            }
            true
        }else
            false
    }
}