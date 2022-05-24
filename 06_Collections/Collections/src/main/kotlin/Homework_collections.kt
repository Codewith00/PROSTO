fun main() {

    println("Filtration method - \"list\" or \"map\"")        //Задания с 1 по 7 пункт
    val s = readLine().toString()                                                  //
    if (s == "list") {                                                             //
        println("Only numbers")                                                    //
        val listContacts = globalList(inputNumbers(readLine().toString()))         //
        val test = listContacts.filter { it.startsWith("+7") }               //
        println(test)                                                              //
        println(listContacts.size)}                                                //
    else{                                                          //Задания с 8 по 11
    if (s == "map"){
        println("Numbers and Names")
    val listContacts = globalListMAP(inputNumbers(readLine().toString()))

    /*  val listContacts = mutableMapOf(
        "+79502850373" to "Anton",
        "79529995553" to "Nikita",
        "+9423159654" to "School",
        "+79142503000" to "Oleg"
    )*/
    val test = listContacts.filter{(key) -> key.startsWith("+7")}
    println(test)
    println(listContacts.size)
    }else{
        println("There is no third =(")
    }}

}

fun globalList(amountNumber: Int): MutableList<String> {
    val listContactsLIST = mutableListOf<String>()
    for (i in 1..amountNumber) {
        println("Enter number: ")
        val a = readLine().toString()
        listContactsLIST.add(a)
    }
    return listContactsLIST}

fun globalListMAP(amountNumber: Int): MutableMap<String, String> {
        val listContacts = mutableMapOf<String, String>()
        for (i in 1..amountNumber) {
            println("Enter number: ")
            val a = readLine().toString()
            println("Enter Name: ")
            val b = readLine().toString()
            listContacts[a] = b
        }
        return listContacts


    }
fun inputNumbers (n: String) : Int{
    val b = n.toLong()
    return if (b>=0)
    {
        n.toInt()
    }
    else
    {
        println("Error")
        inputNumbers(readLine().toString())
    }
}