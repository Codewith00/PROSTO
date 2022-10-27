import kotlin.random.Random

open class AbstractWeapon(
    val maxBullets: Int,
    val fireType: FireType,
    open val ammoMagazine: GenericStack<Ammo>,
    var currentAmountBullets: Int,
    val typeBullets: Ammo
) {

    private fun createBullet(): Ammo {
        return typeBullets

    }

    fun reload() {
        for (j in 1..maxBullets) {
            ammoMagazine.push(createBullet())
            currentAmountBullets++
        }
    }

    fun takeBulletsForFire(): GenericStack<Ammo> {
        val stack = GenericStack<Ammo>()
        when (fireType) {
            is SingleShot -> {
                currentAmountBullets--
                ammoMagazine.pop()?.let { stack.push(it) }
                return stack
            }
            is TripleShot -> {
                for (j in 1..3) {
                    currentAmountBullets--
                    ammoMagazine.pop()?.let { stack.push(it) }
                }
                return stack
            }

        }
    }
}