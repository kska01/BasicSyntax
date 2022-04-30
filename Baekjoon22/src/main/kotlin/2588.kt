fun main() {
    val n1 = readln().toInt()
    val n2 = readln().toInt()
    println("${n1 * (n2 % 10)}")
    println("${n1 * ((n2 / 10) % 10)}")
    println("${n1 * (n2 / 100)}")
    println("${n1 * n2}")
}