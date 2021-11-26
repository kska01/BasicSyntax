fun some1(arg: String): Int {

    val parseData: Int = try {
        println("try..top")
        arg.toInt()
    }catch (e: Exception) {
        println("${e.toString()}")
        0
    }finally {
        println("finally...")
        100
    }
    return parseData
}

fun main() {
    println("${some1("10")}")

    println("${some1("a")}")
}