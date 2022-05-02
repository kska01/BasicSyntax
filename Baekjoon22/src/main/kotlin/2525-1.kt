fun main() {
    val (a, b) = readln().split(' ')
    val c = readln().toInt()
    var totalMin = (a.toInt() * 60) + b.toInt() + c
    if (totalMin >= (24 * 60)) totalMin -= 24 * 60
    val hour = totalMin / 60
    val min = totalMin % 60

    println("$hour $min")
}