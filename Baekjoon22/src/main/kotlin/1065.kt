fun main() {
    val n = readln().toInt()
    var count = 0
    if (n in 1..99) {
        count = n
    }
    else if (n > 99) {
        count = 99
        for (i in 100..n) {
            val str = i.toString()
            if (str[0] - str[1] == str[1] - str[2]) count++
        }
    }
    println(count)
}