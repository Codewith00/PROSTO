import kotlin.random.Random
import kotlin.random.nextInt

open class Animal constructor(var energy: Int, var weight: Int, private var maxAge: Int, var name: String) {
    var age = 0
    fun isTooOld(): Boolean {
        return (age >= maxAge)
    }

    protected fun tryIncrementAge(): Boolean {
        return (Random.nextBoolean())
    }

    fun sleep(): Boolean {
        return if (!isTooOld()) {
            energy = minOf(10, energy + 5)
            age++
            if (tryIncrementAge()) println("$name - sleeping")
            true
        } else return false
    }

    fun eat(): Boolean {
        return if (!isTooOld()) {
            energy = minOf(10, energy + 3)
            weight = minOf(10, weight + 1)
            if (tryIncrementAge()) {
                age++
                println("$name - eating")

            }
            true
        } else false

    }

    open fun move(): Boolean {
        return if (!isTooOld() && energy >= 0 && weight > 0) {
            energy -= 5
            weight --
            println("$name - moving")
            if (tryIncrementAge()) age++
            true
        }  else false
    }

    open fun animalGeneration(): Animal {
        return Animal(
            energy = Random.nextInt(1..10),
            weight = Random.nextInt(1..5),
            maxAge = maxAge,
            name = "$name child"
        )
    }

    fun lifeIsTrue(): Boolean {
return (!isTooOld() && energy >= 0 && weight > 0)
    }
    fun printInfo (){
        println("$name, energy - $energy, weight - $weight, age - $age, maxAge - $maxAge")
    }


}