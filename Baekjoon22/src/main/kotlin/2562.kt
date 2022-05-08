fun main() = with(System.out.bufferedWriter()) {
    val list = mutableListOf<Int>()
    repeat(9) {
        list.add(readln().toInt())
    }
    write("${list.maxOrNull()}\n${list.indexOf(list.maxOrNull()) + 1}")
    flush()
    close()
}