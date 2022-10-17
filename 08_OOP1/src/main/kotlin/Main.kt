import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    var area = NatureReserve().animals
    var test = area
    println("Survivors animals in NatureReserve ${test.size}")
    area.forEach {
        it.printInfo()
    }
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
                println("${it.name} R.I.P")
                test.remove(it)
            }

        }
        area = test
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
                println("${it.name} R.I.P")
                area.remove(it)
            }

        }
        test = area
    }
    println("Survivors animals in NatureReserve ${test.size}")
    test.forEach {
        it.printInfo()
    }

}