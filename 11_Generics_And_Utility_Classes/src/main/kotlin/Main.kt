
fun main() {
    val armi1 = Team()
    val armi2 = Team()
    print("Amount warriors first TEAM: ")
    armi1.fillTeam(readln().toInt())
    print("Amount warriors second TEAM: ")
    armi2.fillTeam(readln().toInt())
    var i = 1
    println("GENERATE FIRST TEAM ...")
    armi1.listTeam.forEach {
        println("$i: $it")
        i++
    }
    i = 1
    println("GENERATE SECOND TEAM ...")
    armi2.listTeam.forEach {
        println("$i: $it")
        i++
    }
    val goBattle = Battle(armi1, armi2)
    while (goBattle.progress() == BattleState.War) {
        goBattle.fight()
        println(
            "TEAM 1 ${BattleState.TeamInfo.getGeneralHP(armi1)} HP, survivor - ${
                BattleState.TeamInfo.getCurrentAmountWarriors(
                    armi1
                )
            } "
        )
        println(
            "TEAM 2 ${BattleState.TeamInfo.getGeneralHP(armi2)} HP, survivor - ${
                BattleState.TeamInfo.getCurrentAmountWarriors(
                    armi2
                )
            } "
        )
    }
    println(goBattle.whoWinHP())
}
