fun main() = with(System.out.bufferedWriter()) {
    var value = readln().toInt() * readln().toInt() * readln().toInt()
    val result = mutableListOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
    var index = 0
    while (value > 0) {
        index = value % 10
        result[index]++
        value /= 10
    }
    repeat(10) {
        write("${result[it]}\n")
    }
    flush()
    close()
}