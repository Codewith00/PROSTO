import BattleState.TeamInfo.getCurrentAmountWarriors
import BattleState.TeamInfo.getGeneralHP

open class Battle(var team1: Team, var team2: Team, open var battleStatus: Boolean = true) {

    private var itTeam1 = team1
    private var itTeam2 = team2


    fun fight() {
        var i = 0
        if (team1.listTeam.size > 0 && team2.listTeam.size > 0) {
            println("command 1 attack")
            team1.listTeam.forEach {
                if (itTeam2.listTeam.size > 0) {
                    if (i > itTeam2.listTeam.size - 1) i = 0
                    it.attack(itTeam2.listTeam[i])
                    if (itTeam2.listTeam[i].currentHealth <= 0) {
                        println("${itTeam2.listTeam[i]} R.I.P")
                        itTeam2.listTeam.removeAt(i)
                        if (i == 0) battleStatus = false
                        i--
                    }
                    i++
                }
            }
        } else battleStatus = false
        team2 = itTeam2

        i = 0
        if (team1.listTeam.size > 0 && team2.listTeam.size > 0) {
            println("command 2 attack")

            team2.listTeam.forEach {
                if (itTeam1.listTeam.size > 0) {
                    if (i > itTeam1.listTeam.size - 1) i = 0

                    it.attack(itTeam1.listTeam[i])

                    if (itTeam1.listTeam[i].currentHealth <= 0) {
                        println("${itTeam1.listTeam[i]} R.I.P")
                        itTeam1.listTeam.removeAt(i)
                        if (i == 0) battleStatus = false
                        i--
                    }
                    i++
                }
            }
            team1 = itTeam1
        } else battleStatus = false
    }

    fun whoWin(): BattleState {
        if (getGeneralHP(team1) == getGeneralHP(team2)) return BattleState.Lose
        return if (getGeneralHP(team1) > getGeneralHP(team2)) BattleState.Win1
        else BattleState.Win2
    }
}

