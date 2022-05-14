fun main() {
    val s = readln()
    val list = ('a'..'z').toMutableList()
    val result = MutableList(26) {-1}
    for ((i, v) in s.withIndex()) {
        val index = list.indexOf(v)
        if (result[index] == -1) result[index] = i
    }
    println(result.joinToString(" "))
}