fun main() {
    val (a, b) = readln().split(' ')
    if (a.toInt() > b.toInt()) {
        println(">")
    } else if (a.toInt() < b.toInt()) {
        println("<")
    } else println("==")
}