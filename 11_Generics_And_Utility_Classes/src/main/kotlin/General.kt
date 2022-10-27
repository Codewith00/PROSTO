open class General(
    override val maxHealth: Int = 300,
    override val accuracy: Int = 30,
    override val weapon: AbstractWeapon = Weapons.createBasuka(),
    override var currentHealth: Int = 300, override var isKilled: Boolean = false, override val dodgeChance: Int = 30
) : AbstractWarrior(maxHealth, accuracy, weapon, currentHealth) {

    override fun toString(): String {
        return "General currentHealth $currentHealth"
    }
}