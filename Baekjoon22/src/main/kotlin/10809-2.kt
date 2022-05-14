fun main() =with(System.out.bufferedWriter()) {
    val s = readln()
    val result = MutableList(26) {-1}
    for ((i, v) in s.withIndex()) {
        val index = v.code - 97
        if (result[index] == -1) result[index] = i
    }
    result.forEach { write("$it ") }
    flush()
    close()
}