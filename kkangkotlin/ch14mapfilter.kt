fun main() {
    val map2 = mapOf<String, Int> ("one" to 15, "two" to 5)
    val resultMap2 = map2.filter { it.value > 10 }
    for (i in resultMap2) {
        println(i)
    }
}