import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    with(System.out.bufferedWriter()) {
        while (true) {
            val st = StringTokenizer(readLine())
            val a = st.nextToken().toInt()
            val b = st.nextToken().toInt()
            if (a == 0 && b == 0) break
            write("${a + b}\n")
        }
        flush()
        close()
    }
}