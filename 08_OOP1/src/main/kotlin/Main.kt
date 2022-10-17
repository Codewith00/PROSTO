import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    val area = NatureReserve().animals
    val test = area
    area.forEach {
        it.printInfo()
    }
    println(area.size)
    for (j in 1..10) {
        area.toMutableList().forEach {
            if (it.lifeIsTrue()) {
                when (Random.nextInt(1..4)) {
                    1 -> it.eat()
                    2 -> it.move()
                    3 -> it.sleep()
                    4 -> when (Random.nextInt(1..6)) {
                        3 -> {
                            test.add(it.animalGeneration())
                            println("WONDERFULL! ${it.name} procreated")
                        }
                    }
                }
            } else {
                it.printInfo()
                println("${it.name} R.I.P")
                test.remove(it)
            }

        }
        test.toMutableList().forEach {
            if (it.lifeIsTrue()) {
                when (Random.nextInt(1..4)) {
                    1 -> it.eat()
                    2 -> it.move()
                    3 -> it.sleep()
                    4 -> when (Random.nextInt(1..6)) {
                        3 -> {
                            area.add(it.animalGeneration())
                            println("WONDERFULL! ${it.name} procreated")
                        }
                    }
                }
            } else {
                it.printInfo()
                println("${it.name} R.I.P")
                area.remove(it)
            }

        }
    }
    println("Survivors animals in NatureReserve ${test.size}")
    test.forEach {
        it.printInfo()
    }

}