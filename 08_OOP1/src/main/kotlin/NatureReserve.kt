import kotlin.random.Random
import kotlin.random.nextInt

open class NatureReserve(name: String, maxOld: Int, weight: Int, energy: Int) : Animal(name, maxOld, weight, energy) {

    init {
        var a = 0
        while (a != 1) {
            when (Random.nextInt(1..3)) {
                1 ->  if (!move()) a++
                2 ->  if (!eat()) a++
                3 ->  if (!dream()) a++
            }
        }
        println("R.I.P")
    }

}