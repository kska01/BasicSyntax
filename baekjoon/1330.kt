import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    var a = sc.nextInt()
    var b = sc.nextInt()

    if (a > b) println(">")
    if (a < b) println("<")
    if (a == b) println("==")
}