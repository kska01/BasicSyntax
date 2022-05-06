import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    with(System.out.bufferedWriter()) {
        val (n, x) = readln().split(' ')
        val st = StringTokenizer(readLine())
        repeat(n.toInt()) {
            val a = st.nextToken().toInt()
            if (x.toInt() > a) write("$a ")
        }
        flush()
        close()
    }
}
