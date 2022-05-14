import java.util.*

fun main() = with(System.out.bufferedWriter()) {
    repeat(readln().toInt()) {
        readln() // 콘솔 입력에서 \n 제거
        val st = StringTokenizer(readln())
        val num = st.nextToken().toInt()
        val str = st.nextToken()
        for (v in str) {
            repeat(num) {
                write("$v")
            }
        }
        write("\n")
    }
    flush()
    close()
}