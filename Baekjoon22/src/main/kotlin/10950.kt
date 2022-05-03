fun main() {
    val n = readln().toInt()
    for (i in 1..n) {
        val (a, b) = readln().split(' ')
        println(a.toInt() + b.toInt())
    }
}