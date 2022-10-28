
abstract class AbstractWeapon(
    private val maxBullets: Int,
    private val fireType: FireType,
    open val ammoMagazine: GenericStack<Ammo>,
    var currentAmountBullets: Int,
) {

    abstract fun createBullet(): Ammo

    fun reload() {
        for (j in 1..maxBullets) {
            ammoMagazine.push(createBullet())
            currentAmountBullets++
        }
    }

    fun takeBulletsForFire(): GenericStack<Ammo> {
        val stack = GenericStack<Ammo>()
        return when (fireType) {
            is SingleShot -> {
                currentAmountBullets--
                ammoMagazine.pop()?.let { stack.push(it) }
                stack
            }
            is TripleShot -> {
                for (j in 1..3) {
                    currentAmountBullets--
                    ammoMagazine.pop()?.let { stack.push(it) }
                }
                stack
            }

        }
    }
}