import java.util.*

fun main() = with(Scanner(System.`in`)) {
    var a = nextInt()
    var b = nextInt()

    if (b in 0..44) {
        a -= 1
        b += 15
    } else b -= 45

    if (a < 0) a += 24

    println("$a $b")
}