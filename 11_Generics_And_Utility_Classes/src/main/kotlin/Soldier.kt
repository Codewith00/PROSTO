import kotlin.random.Random

class Soldier(
   override val maxHealth: Int = 100,
   override val accuracy: Int = 5,
   override val weapon: AbstractWeapon = Weapons.createPistol(),
   override var currentHealth: Int = 100, override val isKilled: Boolean = false, override val dodgeChance: Int = 5
) : AbstractWarrior(maxHealth, accuracy, weapon, currentHealth) {

}