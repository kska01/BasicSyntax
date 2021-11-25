fun main() {
    val list2 = listOf<Int>(12, 8, 9, 20)
    val resultList = list2.filter { it > 10 }
    for (i in resultList) {
        println(i)
    }
}