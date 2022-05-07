fun main() = with(System.`in`.bufferedReader()) {
    with(System.out.bufferedWriter()) {
        while (true) {
            val str = readLine() ?: break
            val (a, b) = str.split(' ')
            write("${a.toInt() + b.toInt()}\n")
        }
        flush()
        close()
    }
}