import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    with(System.out.bufferedWriter()) {
        val st1 = StringTokenizer(readLine())
        val st2 = StringTokenizer(readLine())
        val n = st1.nextToken().toInt()
        val x = st1.nextToken().toInt()

        repeat(n) {
            val a = st2.nextToken().toInt()
            if(x > a) write("$a ")
        }
        flush()
        close()
    }
}