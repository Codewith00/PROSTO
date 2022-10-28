object Weapons {
    object CreatePistol : AbstractWeapon(10, SingleShot, GenericStack(), 0) {
        override fun createBullet(): Ammo {
return Ammo.IRON_BULLET
        }

    }

    object CreateSMG : AbstractWeapon(30, TripleShot(3), GenericStack(), 0) {
        override fun createBullet(): Ammo {
            return Ammo.FIRE_BULLET
        }
    }

    object CreateShotgun: AbstractWeapon(8, SingleShot, GenericStack(), 0){
        override fun createBullet(): Ammo {
            return Ammo.COLD_BULLET
        }

    }

    object CreateBasuka : AbstractWeapon(1, SingleShot, GenericStack(), 0) {
        override fun createBullet(): Ammo {
            return Ammo.URAN_BULLET
        }
    }
}