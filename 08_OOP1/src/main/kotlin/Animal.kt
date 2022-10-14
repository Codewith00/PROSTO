import kotlin.random.Random

class Animal(energy: Int, weight: Int, maxOld: Int, name: String) {
    constructor(descriptor: Pair<Int, Int>, maxOld: Int, name: String) : this(
        energy = descriptor.first,
        weight = descriptor.second,
        maxOld = maxOld,
        name = name
    )

    var itMaxOld = maxOld
    var old = 0
    var itEnergy = energy
    var itWeight = weight
    var itName = name

    fun isTooOld(old: Int): Boolean {
        return (old >= itMaxOld)
    }

    fun dream() {
        itEnergy - 5
        old++
        println("$itName - спит")
    }

    fun eat() {
        itWeight++
        itEnergy + 3
        if (Random.nextBoolean()) old++
        if (itEnergy > 2 || old <= itMaxOld)
            println("$itName - ест")
    }

    fun move() {
        itEnergy - 5
        itWeight - 1
        if (Random.nextBoolean()) old++
        println("$itName - передвигается")
    }

}