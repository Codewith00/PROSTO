import kotlin.random.Random
import kotlin.random.nextInt

open class Dog(name: String, maxOld: Int, weight: Int, energy: Int) : NatureReserve(name, maxOld, weight, energy) {

    override fun move():Boolean {
        itEnergy -= 5
        itWeight -= 1
        if (tryIncrementAge()) old++
        return if (itEnergy > 4 && itWeight > 0 && isTooOld(old)) {
            println("$itName - RUN")
            when (Random.nextInt(1..10)){              //Шанс рождения 10%
                5 -> println(offSpring())
            }
            true
        }else
            false
    }
}