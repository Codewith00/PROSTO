import java.util.*

object Channels {

    private val list = mutableListOf(
        "NEWS", "2x2", "porn", "SolovevTV",
        "PutinTV", "NavalniiFreeDome", "Spring",
        "Sport", "RUTV", "Covid-19", "Armagedon"
    )

    fun getRandomChannels(): List<String> {
        return list.shuffled()

    }
}