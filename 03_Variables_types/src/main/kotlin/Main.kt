fun main(args: Array<String>) {


    var firstName: String = "Anton"
    var lastName: String = "Markov"
    var height: Double = 149.9
    var weight: Float = 95.2f
    var isChild: Boolean = height < 150 || weight < 40

    var infoChild: String = "Adult"
    if(isChild == true)
        infoChild = "Child"
    var info: String = """firstName - $firstName
        |lastName - $lastName
        |height - $height
        |weight - $weight
        |is Child? - $infoChild
    """.trimMargin()
    println(info)


    // Try adding program arguments at Run/Debug configuration
   // println("Program arguments: ${args.joinToString()}")
}