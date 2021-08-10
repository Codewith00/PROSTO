fun main(args: Array<String>) {


    val firstName: String = "Anton"
    val lastName: String = "Markov"
    var height: Double = 149.9
    var weight: Float = 39.9f
    var isChild: Boolean = height < 150 || weight < 40
    var infoChild = if(isChild) "Child" else "Adult"

    var info: String = """firstName - $firstName
        |lastName - $lastName
        |height - $height
        |weight - $weight
        |is Child? - $infoChild
    """.trimMargin()
    println(info)
    height = 198.7
    isChild = height < 150 || weight < 40
    infoChild = if(isChild) "Adult" else "Child"
    info = """ 
        | 
        |firstName - $firstName
        |lastName - $lastName
        |height - $height
        |weight - $weight
        |is Child? - $infoChild
    """.trimMargin()
    println(info)


    // Try adding program arguments at Run/Debug configuration
   // println("Program arguments: ${args.joinToString()}")
}