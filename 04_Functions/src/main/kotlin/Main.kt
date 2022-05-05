
fun main() {
    val message = "F2p)v\"y233{0->c}ttelciFc"
     one(message)
     two(message)

}
 fun one(Mess: String) : String {
     val one1 = shift(shiftp = Mess, a = 1)
     val one2 = one1.replace("5","s")
     val one3 = one2.replace("4","u")
     val one4 = shift(shiftp = one3, a = -3)
     val one5 = (one4.replace("0","o"))
     division(one5)
         return Mess
 }
 fun two(Mess: String) : String {
     val one11 = Mess.reversed()
     val one12 = shift(shiftp = one11, a = -4)
     val one13 = (one12.replace("_"," "))
     division(one13)
     return Mess
}
fun shift(shiftp: String, a: Int) : String = shiftp.map {char -> char + a}.joinToString("")

fun division(a: String) : String {
    val length = ((a.count() / 2))
    println(a.substring(0, length))
    return a
}



