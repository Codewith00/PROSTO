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

    fun takeBulletsForFire(): Ammo? {
        when (fireType) {
            is SingleShot -> {
                currentAmountBullets--
                return ammoMagazine.pop()
            }
            is TripleShot -> for (j in 1..3) {
                currentAmountBullets--
                return ammoMagazine.pop()
            }
        }
    return null}
}