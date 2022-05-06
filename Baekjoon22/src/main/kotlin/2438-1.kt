fun main() = with(System.`in`.bufferedReader()) {
    with(System.out.bufferedWriter()) {
        val n = readLine().toInt()
        repeat(n) {
            repeat(it + 1) {
                write("*")
            }
            write("\n")
        }
        flush()
        close()
    }
}