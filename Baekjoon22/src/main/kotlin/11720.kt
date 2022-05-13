fun main() {
    val n = readln().toInt()
    val str = readln()
    var result = 0
    repeat(n) {
        result += str[it].toString().toInt()
    }
    println(result)
}