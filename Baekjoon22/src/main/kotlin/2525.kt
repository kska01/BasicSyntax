fun main() {
    val (a, b) = readln().split(' ')
    val c = readln().toInt()
    var h = c / 60
    val m = c % 60

    val y = if (b.toInt() + m >= 60) {
        h++
        b.toInt() + m - 60
    } else b.toInt() + m
    val  x  = if (a.toInt() + h > 23) {
        a.toInt() + h - 24
    } else a.toInt() + h

    println("$x $y")
}