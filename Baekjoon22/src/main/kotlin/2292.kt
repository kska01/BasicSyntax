fun main() {
    val input = readln().toInt()
    var count = 1
    var value = 1
    while (true) {
        if (input == 1) break
        if (input > 1) {
            value += 6 * count
        }
        count++

        if (input <= value) break
    }
    println(count)
}