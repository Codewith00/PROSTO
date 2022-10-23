import kotlin.random.Random

open class AbstractWeapon(
    val maxBullets: Int,
    val fireType: FireType,
    val ammoMagazine: GenericStack<Ammo>,
    var currentAmountBullets: Int
) {

    fun createBullet(): Ammo {
        return when (Random.nextInt(1, 4)) {
            1 -> Ammo.IRON_BULLET
            2 -> Ammo.FIRE_BULLET
            3 -> Ammo.COLD_BULLET
            4 -> Ammo.URAN_BULLET
            else -> Ammo.IRON_BULLET
        }
    }

    fun reload() {
for (j in 1..maxBullets) {
    ammoMagazine.push(createBullet())
    currentAmountBullets ++
}
    }

    fun takeBulletsForFire() {
        when (fireType){
            is SingleShot -> ammoMagazine.pop()
            is TripleShot -> for (j in 1..3)ammoMagazine.pop()
        }
    }
}