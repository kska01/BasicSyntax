fun main() {
    val border = "%"
    printBorder(border)
    println("Happy birthday, Jhansi!")
    printBorder(border)
}

fun printBorder(border: String) {
    repeat(23) {
        print(border)
    }
    println()
}