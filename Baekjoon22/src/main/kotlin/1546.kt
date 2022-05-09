import java.util.*

fun main() {
    val n = readln().toInt()
    val st = StringTokenizer(readln())
    val arr = ArrayList<Double>()
    repeat(n) {
        arr.add(st.nextToken().toDouble())
    }
    val max = arr.maxOf { it }
    var ever: Double = 0.0
    repeat(n) {
        ever += arr[it] / max * 100
    }
    println(ever / n)
}