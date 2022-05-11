import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    with(System.out.bufferedWriter()) {
        repeat(readln().toInt()) {
            val arr = ArrayList<Int>()
            var average = 0.0
            var count = 0
            val st = StringTokenizer(readLine())
            val n = st.nextToken().toInt()
            repeat(n) {
                arr.add(st.nextToken().toInt())
                average += arr[it]
            }
            average /= n
            repeat(n) {
                if (arr[it] > average) count++
            }
            write(String.format("%.3f", count * 100.0 / n) + "%\n")
        }
        flush()
        close()
    }
}