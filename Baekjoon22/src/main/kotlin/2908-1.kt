import java.util.*

fun main() = with(System.`in`.bufferedReader()){
    val st = StringTokenizer(readLine())
    val a = st.nextToken().reversed()
    val b = st.nextToken().reversed()
    println(if (a > b) a else b)
}