fun main() = with(System.out.bufferedWriter()) {
    val n = readln().toInt()
    repeat(n) {
        val st = readln().lowercase()
        var count = 0
        var result = 0
        for (i in st) {
            if (i == 'o') {
                count++
                result += count
            } else {
                count = 0
            }
        }
        write("$result\n")
    }
    flush()
    close()
}