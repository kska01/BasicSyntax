import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val year = sc.nextInt()

    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
        println(1)
    } else {
        println(0)
    }
}