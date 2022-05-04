import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*


fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val st = StringTokenizer(br.readLine())
        bw.write("${st.nextToken().toInt() + st.nextToken().toInt()}\n")
    }
    bw.flush()
    bw.close()
}