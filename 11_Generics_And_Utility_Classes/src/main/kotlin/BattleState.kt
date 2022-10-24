sealed class BattleState(stateBattle: String) {

    object Win1 : BattleState("Command 1 WIN")
    object Win2 : BattleState("Command 2 WIN")
    object Lose : BattleState("Not winner")
//     class Progress : ????


}
