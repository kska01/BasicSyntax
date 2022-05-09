fun main() = with(System.out.bufferedWriter()) {
    val source = (readln().toInt() * readln().toInt() * readln().toInt()).toString().toList()
    val result = IntArray(10) {0}
    source.forEach {
        result[it - '0']++
    }
    result.forEach { write("$it\n") }
    flush()
    close()
}