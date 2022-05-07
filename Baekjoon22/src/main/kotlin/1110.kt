fun main() {
    val n = readln().toInt()
    var result = 0
    var count = 0
    while (n != result) {
        val a = if (count > 0) result else n
        result = (a % 10) * 10 + ((a/10) + (a % 10)) % 10
        count++
    }
    if (n == 0) count = 1
    println(count)
}