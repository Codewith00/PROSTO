import kotlin.random.Random

open class Team() {
    val listTeam = mutableListOf<AbstractWarrior>()
fun fillTeam (amount: Int){
    for (j in 0 until amount){
    listTeam.add(j, randomWarrior())}
}
    private fun randomWarrior (): AbstractWarrior{
        return when (Random.nextInt(1, 12)){
           1 -> Soldier()
           2 -> Soldier()
           3 -> Soldier()
           4 -> Soldier()
           5 -> Soldier()
           6 -> Leitenant()
           7 -> Leitenant()
           8 -> Captain()
           9 -> Captain()
           10 -> Captain()
           11 -> General()

           else -> {General()}
       }
    }

    override fun toString(): String {
        return "Team(listTeam=$listTeam)"
    }
}