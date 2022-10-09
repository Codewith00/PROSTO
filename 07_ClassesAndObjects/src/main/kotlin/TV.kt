class TV(mark: String, model: String, size: Double) {

    constructor(descriptor: Pair<String, String>, size: Double) : this(
        mark = descriptor.first,
        model = descriptor.second,
        size = 43.0
    )

    private var channels = listOf<String>("NEWS", "SPORT", "2x2", "ZombiTV", "18xXx")        //Список каналов
    var currentVolume = 15
    var currentChannel = channels[0]
    var power = false
        private set

    fun upVolume(volume: Int) {                                           //Добавить\убавить громкость
        currentVolume -= volume
        println("Громкость - $currentVolume")
    }

    fun downVolume(volume: Int) {
        currentVolume += volume
        println("Громкость - $currentVolume")
    }

    fun switchChannel(canal: Int) {                                        //Переключение каналов
        if (!power) {
            true
            currentChannel = channels[canal]
            println("Текущий канал - $currentChannel")
        }
    }

    fun turnOnOff() {                                                      //ВКЛ\ВЫКЛ телевизора
        power = if (!power) {
            println("Включение ТВ")
            true
        } else {
            println("Выключение ТВ")
            false
        }
    }

    companion object {                                                 // Максимальная громкость
        const val volume: Int = 100

    }


}