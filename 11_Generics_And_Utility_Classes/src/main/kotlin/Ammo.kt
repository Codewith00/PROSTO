import kotlin.random.Random
import kotlin.random.nextInt

enum class Ammo(var damage: Int, val crit: Int) {

    IRON_BULLET(1, 2),
    FIRE_BULLET(2, 3),
    COLD_BULLET(3, 4),
    URAN_BULLET(5, 5);

    fun currentDamage(): Int {
        if (damage.critical(damage)) damage *= crit
        return damage
    }

    private fun Int.critical(chance: Int): Boolean {  //Шанс крита расчет вводимого значения - чем больше значение, тем меньше шанс
        return when (Random.nextInt(0, chance)) {
            1 -> true
            else -> false
        }

    }


}