fun main() {
    val (a, b) = readln().split(' ')
    println(
        if (a.reversed() > b.reversed()) a.reversed() else b.reversed()
    )
}