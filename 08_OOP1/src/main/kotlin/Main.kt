import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    val area = NatureReserve()
    val trueArea = area.animals.toMutableList()
    println(trueArea.size)
    area.animals.forEach {
        for (j in 1..10) {                          //количство действий для каждой особи (10)
            if (it.lifeIsTrue()) {
                when (Random.nextInt(1..4)) {
                    1 -> it.eat()
                    2 -> it.move()
                    3 -> it.sleep()
                    4 -> when (Random.nextInt(1..6)) {
                        3 -> {
                            trueArea.add(it.animalGeneration())
                            println("WONDERFULL! ${it.name} procreated")
                        }
                    }
                }
            } else {

                println(it.printInfo())
                println("${it.name} R.I.P")
                trueArea -= it

                break
            }
        }
    }
    val trueAreaChild = trueArea.toMutableList()
    trueArea.shuffle()
    trueArea.forEach {
        for (j in 1..10) {                          //количство действий для каждой особи (10)
            if (it.lifeIsTrue()) {
                when (Random.nextInt(1..4)) {
                    1 -> it.eat()
                    2 -> it.move()
                    3 -> it.sleep()
                    4 -> when (Random.nextInt(1..6)) {
                        3 -> {
                            trueAreaChild.add(it.animalGeneration())
                            println("WONDERFULL! ${it.name} procreated")
                        }
                    }
                }
            } else {
                trueAreaChild.remove(it)
                println("${it.name} R.I.P")
                break
            }
        }

    }
    println("Survivors animals in NatureReserve ${trueAreaChild.size}")
    trueAreaChild.forEach {
        println("${it.printInfo()}")
    }

}