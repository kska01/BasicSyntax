fun some1() {
    val name: String? = null
    val s: String = name ?: throw IllegalArgumentException("Name required")
    println("some1 bottom")
}
fun some2(arg: Int): Nothing {
    if(arg > 0)
        throw Exception("some2 exception.. arg>0 true")
    else
        throw Exception("some2 exception.. arg>0 false")
}

fun main() {
    try {
        some1()
    } catch (e: Exception) {
        println(e.toString())
    }

    try {
        some2(10)
    } catch (e: Exception) {
        println(e.toString())
    }
}