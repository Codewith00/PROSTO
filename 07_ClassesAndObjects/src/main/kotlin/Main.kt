fun main(args: Array<String>) {

    val sony = TV(descriptor = "Sony" to "SB43AU4500", 11.0)
    val samsung = TV(mark = "Samsung", model = "Serif", size = 75.0)
    sony.switchChannel(0)
    sony.upVolume(110)
    sony.downVolume(200)
    sony.turnOnOff()
    sony.upSwitchChannel()
    samsung.upSwitchChannel()
    sony.upSwitchChannel()
    sony.downSwitchChannel()
    sony.upSwitchChannel()


}