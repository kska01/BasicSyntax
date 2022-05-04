import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    for (i in 1..n) {
        bw.write("$i\n")
    }
    bw.flush()
    bw.close()
}