import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    with(System.out.bufferedWriter()) {
        val n = readLine().toInt()
        val st = StringTokenizer(readLine())
        val list = mutableListOf<Int>()
        repeat(n) {
            list.add(st.nextToken().toInt())
        }
        write("${list.minOrNull()} ${list.maxOrNull()}")
        flush()
        close()
    }
}