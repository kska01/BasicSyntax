import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    with(System.out.bufferedWriter()) {
        val n = readLine().toInt()
        val st = StringTokenizer(readLine())
        var max = -1000000
        var min = 1000000
        repeat(n) {
            val num = st.nextToken().toInt()
            if (num > max) max = num
            if (num < min) min = num
        }
        write("$min $max")
        flush()
        close()
    }
}