import kotlin.random.Random

open class Soldier(
   override val maxHealth: Int = 100,
   override val accuracy: Int = 5,
   override val weapon: AbstractWeapon = Weapons.CreatePistol,
   override var currentHealth: Int = 100, override var isKilled: Boolean = false, override val dodgeChance: Int = 5
) : AbstractWarrior(maxHealth, accuracy, weapon, currentHealth) {
   override fun toString(): String {
      return "Soldier currentHealth = $currentHealth"
   }

}