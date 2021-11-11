import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val a = nextInt()
    val b = nextInt()

    val result = when {
        a > 0 && b > 0 -> 1
        a < 0 && b > 0 -> 2
        a < 0 && b < 0 -> 3
        else -> 4
    }
    println(result)
}