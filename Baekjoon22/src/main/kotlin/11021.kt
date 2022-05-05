import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    for(i in 1..br.readLine().toInt()) {
        val st = StringTokenizer(br.readLine())
        bw.write("Case #$i: ${st.nextToken().toInt() + st.nextToken().toInt()}\n")
    }
    bw.flush()
    bw.close()
}