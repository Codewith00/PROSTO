interface Warrior {
    val isKilled: Boolean
    val dodgeChance: Int

    fun attack(warrior: Warrior)
    fun takeDamage(damage: Int)

}