fun main() = with(System.out.bufferedWriter()) {
    val list = (readln().toInt() * readln().toInt() * readln().toInt()).toString().toList()
    val result = mutableListOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
    for (i in list) {
        when(i) {
            '0' -> result[0]++
            '1' -> result[1]++
            '2' -> result[2]++
            '3' -> result[3]++
            '4' -> result[4]++
            '5' -> result[5]++
            '6' -> result[6]++
            '7' -> result[7]++
            '8' -> result[8]++
            '9' -> result[9]++
        }
    }
    repeat(10) {
        write("${result[it]}\n")
    }
    flush()
    close()
}