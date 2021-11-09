import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    println(result(a))
}
private fun result(a: Int) =
    if (a in 90..100) 'A'
    else if (a in 80..89) 'B'
    else if (a in 70..79) 'C'
    else if (a in 60..69) 'D'
    else 'F'
