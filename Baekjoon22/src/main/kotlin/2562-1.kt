fun main() = with(System.out.bufferedWriter()) {
    var max = 0
    var index = 0
    for (i in 1..9) {
        val value = readln().toInt()
        if (value > max) {
            max = value
            index = i
        }
    }
    write("$max\n$index")
    flush()
    close()
}