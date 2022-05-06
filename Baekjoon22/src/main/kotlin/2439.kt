fun main() = with(System.`in`.bufferedReader()) {
    with(System.out.bufferedWriter()) {
        val n = readLine().toInt()
        for((x, i) in (n downTo 1).withIndex()) {
            repeat(i - 1) {
                write(" ")
            }
            repeat(x + 1) {
                write("*")
            }
            newLine()
        }
        flush()
        close()
    }
}