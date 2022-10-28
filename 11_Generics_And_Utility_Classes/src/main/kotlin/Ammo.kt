import kotlin.random.Random

enum class Ammo(private val damage: Int, private val crit: Int) {

    IRON_BULLET(4, 2),
    FIRE_BULLET(5, 3),
    COLD_BULLET(3, 10),
    URAN_BULLET(15, 5);

    fun currentDamage(): Int {
        return if (damage.critical(damage)) damage * crit
        else 0
    }

    private fun Int.critical(chance: Int): Boolean {  //Шанс крита расчет вводимого значения - чем больше значение, тем меньше шанс
        return when (Random.nextInt(0, chance)) {
            1 -> true
            else -> false
        }

    }


}