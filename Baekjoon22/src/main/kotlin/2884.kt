fun main() {
    var (h, m) = readln().split(' ').map { it.toInt() }
    if (m in 0..44) {
        h -= 1
        m += 15
    } else m -= 45

    if (h < 0) h = 23

    println("$h $m")
}