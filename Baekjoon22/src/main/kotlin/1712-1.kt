import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val st = StringTokenizer(readLine())
    val fix = st.nextToken().toInt()
    val variable = st.nextToken().toInt()
    val price = st.nextToken().toInt()
    if (variable < price) {
        println(fix / (price - variable) + 1)
    } else {
        println(-1)
    }
}