object Weapons  {
    fun createPistol(): AbstractWeapon{
        return AbstractWeapon(10, SingleShot, GenericStack(), 0, Ammo.IRON_BULLET)
    }
    fun createSMG(): AbstractWeapon{
        return AbstractWeapon(30, TripleShot(3), GenericStack(), 0,Ammo.FIRE_BULLET)
    }
    fun createShotgun(): AbstractWeapon{
        return AbstractWeapon(8, SingleShot, GenericStack(), 0, Ammo.COLD_BULLET)
    }
    fun createBasuka(): AbstractWeapon{
        return AbstractWeapon(1, SingleShot, GenericStack(), 0, Ammo.URAN_BULLET)
    }
}