sealed class BattleState(val stateBattle: String) {
    object Win1 : BattleState("Command 1 WIN") {
        override fun toString(): String {
            return stateBattle
        }
    }

    object Win2 : BattleState("Command 2 WIN") {
        override fun toString(): String {
            return stateBattle
        }
    }

    object Lose : BattleState("Not winner") {
        override fun toString(): String {
            return stateBattle
        }
    }

    object War : BattleState("Now there is a war") {
        override fun toString(): String {

            return stateBattle
        }
    }

    object TeamInfo {
        fun getGeneralHP(test: Team): Int {
            var health = 0
            test.listTeam.forEach {
                health += it.currentHealth
            }
            return health
        }

        fun getCurrentAmountWarriors(test: Team): Int {
            return test.listTeam.size
        }
    }


}
