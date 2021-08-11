fun main(args: Array<String>) {


    val firstName: String = "Anton"
    val lastName: String = "Markov"
    var height: Double = 169.9
    var weight: Float = 45.2f
    var isChild: Boolean = height < 150 || weight < 40
    var infoChild = if(isChild) "Child" else "Adult"
    var info: String = """firstName - $firstName
        |lastName - $lastName
        |height - $height
        |weight - $weight
        |is Child? - $infoChild
    """.trimMargin()
    println(info)
    height = 120.3
    weight = 35.1f
    isChild = height < 150 || weight < 40
    infoChild = if(isChild) "Child" else "Adult"
    info ="""
        | 
        |firstName - $firstName
        |lastName - $lastName
        |height - $height
        |weight - $weight
        |is Child? - $infoChild
    """.trimMargin()
    println(info)

}