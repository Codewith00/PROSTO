class Captain(
    override val maxHealth: Int = 150,
    override val accuracy: Int = 15,
    override val weapon: AbstractWeapon = Weapons.createSMG(),
    override var currentHealth: Int = 150, override val isKilled: Boolean = false, override val dodgeChance: Int = 15
) : AbstractWarrior(maxHealth, accuracy, weapon, currentHealth) {

}