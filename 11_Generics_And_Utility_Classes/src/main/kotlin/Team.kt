import kotlin.random.Random

class Team() {
   private val listTeam = mutableMapOf<Int, Warrior>()
fun fillTeam (amount: Int){
    for (j in 0..amount){
    listTeam[j] = randomWarrior()}
}
    private fun randomWarrior (): Warrior{
       val a = when (Random.nextInt(1, 2)){
            1 -> Soldier()
            2 -> when (Random.nextInt(1, 2)){
                1 -> Soldier()
                2 -> Captain()
                else -> Soldier()
            }
            else -> when (Random.nextInt(1, 2)){
                1 -> Soldier()
                2 -> Soldier()
                else -> when (Random.nextInt(1, 2)){
                    1 -> Captain()
                    2 -> Soldier()
                    else -> General()
                }
            }
        }
        return a
    }
}