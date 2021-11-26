fun some(arg: Int): Int {
    if(arg < 1)
        throw Exception("parameter must be greater than zero")
    else {
        var sum = 0
        for(i in 1..arg) {
            sum += 1
        }
        return sum
    }
}

fun main() {
    try {
        println("${some(5)}")

        println("${some(-1)}")

        println("${some(-1)}")
    } catch (e: Exception) {
        println("Exception....${e.toString()}")
    }
}