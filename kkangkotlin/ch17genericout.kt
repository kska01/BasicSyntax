fun main() {
    val mutableList: MutableList<Int> = mutableListOf(10, 20)
//    val mutableList2: MutableList<Number> = mutableList        Error

    val immutableList: List<Int> = listOf(10, 20)
    val immutableList2: List<Number> = immutableList
}