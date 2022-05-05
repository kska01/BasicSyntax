import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var n = readLine().toInt()
    repeat(n) {
        bw.write("${n--}\n")
    }
    bw.flush()
    bw.close()
}