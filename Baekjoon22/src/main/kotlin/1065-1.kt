fun main() {
    val n = readln().toInt()
    println(check(n))
}

fun check(n: Int): Int {
    var count = 0
    if (n < 100) {
        count = n
    } else {
        count = 99
        for (i in 100..n) {
            val str = i.toString()
            if (str[0] - str[1] == str[1] - str[2]) count++
        }
    }
    return count
}
