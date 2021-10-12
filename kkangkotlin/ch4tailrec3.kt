package four_two_six

tailrec fun sum(n: Int): Int {
    if (n <= 0) return n
    else return n + sum(n - 1)
}
tailrec fun sum2(n: Int, result: Int = 0): Int {
    if (n <= 0) return result 
    else return sum2(n - 1, n + result)
}
fun main() {
    println(sum(3))
    println(sum2(3))
}