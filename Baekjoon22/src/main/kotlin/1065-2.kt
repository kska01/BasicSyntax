fun main() {
    val n = readln().toInt()
    println(checkNum(n))
}

fun checkNum(n: Int): Int {
    var count = 0
    if (n < 100) {
        count = n
    } else {
        count = 99
        for (i in 100..n) {
            val a = i / 100
            val b = i / 10 - i / 100 * 10
            val c = i % 10
            if (a - b == b - c) count++
        }
    }
    return count
}