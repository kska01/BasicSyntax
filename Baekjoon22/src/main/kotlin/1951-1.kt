import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    with(System.out.bufferedWriter()) {
        while (true) {
            val str = readLine() ?: break
            val st = StringTokenizer(str)
            write("${st.nextToken().toInt() + st.nextToken().toInt()}\n")
        }
        flush()
        close()
    }
}