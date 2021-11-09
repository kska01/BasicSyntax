import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    println(result(a))
}
private fun result(a: Int) =
    when(a) {
        in 90..100 -> 'A'
        in 80..89 -> 'B'
        in 70..79 -> 'C'
        in 60..69 -> 'D'
        else -> 'F'
    }