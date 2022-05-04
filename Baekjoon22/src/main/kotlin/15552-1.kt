import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(readLine().toInt()) {
        val st = StringTokenizer(readLine())
        bw.write("${st.nextToken().toInt() + st.nextToken().toInt()}\n")
    }
    bw.flush()
    bw.close()
}