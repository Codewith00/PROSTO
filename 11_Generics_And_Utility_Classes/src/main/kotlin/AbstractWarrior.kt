import kotlin.random.Random

abstract class AbstractWarrior(
    open val maxHealth: Int,
    open val accuracy: Int,
    open val weapon: AbstractWeapon,
    open var currentHealth: Int) : Warrior {

    override fun attack(warrior: Warrior) {
        val listShots = GenericStack<Ammo>()
        var currentDamage = 0
        if (weapon.ammoMagazine.isEmpty()) {
            weapon.reload()

        } else {
            if (warrior.dodgeChance < accuracy) {
                if (Random.nextBoolean()) weapon.takeBulletsForFire()?.let { listShots.push(it) }
            }else weapon.takeBulletsForFire()?.let { listShots.push(it) }

        }
         while (!listShots.isEmpty()) {currentDamage += listShots.pop()!!.currentDamage()}
        warrior.takeDamage(currentDamage)
    }

    override fun takeDamage(damage: Int) {
        currentHealth -= damage

    }
}