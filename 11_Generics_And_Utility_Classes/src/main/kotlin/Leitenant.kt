class Leitenant (
    override val maxHealth: Int = 200,
    override val accuracy: Int = 20,
    override val weapon: AbstractWeapon = Weapons.CreateShotgun,
    override var currentHealth: Int = 200, override var isKilled: Boolean = false, override val dodgeChance: Int = 20
) : AbstractWarrior(maxHealth, accuracy, weapon, currentHealth) {

    override fun toString(): String {
        return "Leitenant currentHealth = $currentHealth"
    }
}