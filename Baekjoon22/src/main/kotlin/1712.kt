import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val st = StringTokenizer(readLine())
    val fix = st.nextToken().toLong()
    val variable = st.nextToken().toLong()
    val price = st.nextToken().toLong()
    var count = 1L
    if (variable < price) {
        while (true) {
            if (fix + variable * count < price * count) break else count++
        }
        println(count)
    } else {
        println(-1)
    }

}