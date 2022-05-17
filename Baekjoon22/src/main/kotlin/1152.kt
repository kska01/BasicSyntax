import java.util.*

fun main() {
    val line = readln()
    val sc = Scanner(line)
    var count = 0
    while (sc.hasNext()) {
        sc.next()
        count++
        if (!sc.hasNext()) break
    }
    println(count)
}