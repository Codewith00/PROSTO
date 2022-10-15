import kotlin.random.Random
import kotlin.random.nextInt

open class Animal(name: String, maxOld: Int, weight: Int, energy: Int) {
    constructor(descriptor: Pair<String, Int>, energy: Int, weight: Int) : this(
        name = descriptor.first,
        maxOld = descriptor.second,
        weight = weight,
        energy = energy
    )

    var itMaxOld = maxOld
    var old = 0
    var itEnergy = energy
    var itWeight = weight
    var itName = name
    val childAnimals = mutableListOf(name, maxOld.toString(), weight.toString(), energy.toString())

    internal fun tryIncrementAge(): Boolean {
        return (Random.nextBoolean())
    }

    fun isTooOld(old: Int): Boolean {                   //Проверка на превышение макс. возраста
        return (old <= itMaxOld)                        //Используется в fun dream, eat, move
    }

    fun dream():Boolean {
        itEnergy += 5
        old++
        if (isTooOld(old)) {
            println("$itName - sleeping")
            when (Random.nextInt(1..10)){              //Шанс рождения 10%
                5 -> println(offSpring())
            }
return true

        }
        return false
    }

    fun eat():Boolean {
        itWeight++
        itEnergy += 3
        if (tryIncrementAge()) old++
        if (isTooOld(old)){
            println("$itName - eating")
        return true}
        return false
    }

    open fun move():Boolean {
        itEnergy -= 5
        itWeight -= 1
        if (tryIncrementAge()) old++
        return if (itEnergy > 4 && itWeight > 0 && isTooOld(old)) {
            println("$itName - moving")
            when (Random.nextInt(1..10)){              //Шанс рождения 10%
                5 -> println(offSpring())
            }
            true
        }else
            false
    }


    fun offSpring(): MutableList<String> {                           //Рождение потомства, есть шанс во время сна и передвижения
        println("BIRTH OF OFF spring")
        return mutableListOf(
            itName + "child",
            itMaxOld.toString(),
            Random.nextInt(1..5).toString(),
            Random.nextInt(1..10).toString()
        )
    }

}