import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    for(i in 1..br.readLine().toInt()) {
        val st = StringTokenizer(br.readLine())
        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()
        bw.write("Case #$i: $a + $b = ${a + b}\n")
    }
    bw.flush()
    bw.close()
}