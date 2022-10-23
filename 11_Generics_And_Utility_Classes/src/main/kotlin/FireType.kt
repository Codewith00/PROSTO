
sealed class FireType
    object SingleShot : FireType()

    data class TripleShot(val turn: Int ) : FireType()

