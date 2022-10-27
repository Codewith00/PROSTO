open class Captain(
    override val maxHealth: Int = 150,
    override val accuracy: Int = 15,
    override val weapon: AbstractWeapon = Weapons.createSMG(),
    override var currentHealth: Int = 150, override var isKilled: Boolean = false, override val dodgeChance: Int = 15
) : AbstractWarrior(maxHealth, accuracy, weapon, currentHealth) {

    override fun toString(): String {
        return "Captain currentHealth = $currentHealth"
    }
}