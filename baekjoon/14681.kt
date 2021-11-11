import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val a = this.nextInt()
    val b = this.nextInt()

    val result =
        if (a > 0 && b > 0) 1
        else if (a < 0 && b > 0) 2
        else if (a < 0 && b < 0) 3
        else 4

    println(result)
}