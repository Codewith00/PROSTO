import kotlin.random.Random
import kotlin.random.nextInt

class Fish(energy: Int, weight: Int, maxAge: Int, name: String) : Animal(energy, weight, maxAge, name) {
    private var itMaxAge = maxAge
    override fun move(): Boolean {
        return if (!isTooOld() && energy >= 0 && weight > 0) {
            energy -= 5
            weight --
            println("$name - SWIMMING")
            if (tryIncrementAge()) age++
            true
        }  else false
    }

    override fun animalGeneration(): Animal {
        return Fish(
            energy = Random.nextInt(1..10),
            weight = Random.nextInt(1..5),
            maxAge = itMaxAge,
            name = "$name child"
        )
    }
}