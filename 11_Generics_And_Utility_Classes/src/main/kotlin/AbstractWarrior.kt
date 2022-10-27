import kotlin.random.Random

abstract class AbstractWarrior(
    open val maxHealth: Int,
    open val accuracy: Int,
    open val weapon: AbstractWeapon,
    open var currentHealth: Int
) : Warrior {

    override fun attack(warrior: Warrior) {
        var currentDamage = 0
        val listShots: GenericStack<Ammo>
        if (weapon.ammoMagazine.isEmpty()) {
            weapon.reload()
            println("reload")

        } else {
            if (warrior.dodgeChance >= accuracy) {
                if (Random.nextBoolean()) {
                    listShots = weapon.takeBulletsForFire()
                    while (!listShots.isEmpty()) {
                        currentDamage += listShots.pop()!!.currentDamage()
                    }
                    warrior.takeDamage(currentDamage)
                }
            }else {
                listShots = weapon.takeBulletsForFire()
                while (!listShots.isEmpty()) {
                    currentDamage += listShots.pop()!!.currentDamage()
                    warrior.takeDamage(currentDamage)
                }
            }
        }


    }

    override fun takeDamage(damage: Int) {
        currentHealth -= damage

    }


}