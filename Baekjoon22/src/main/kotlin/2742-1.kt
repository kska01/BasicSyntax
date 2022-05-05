fun main() {
    val n = readln().toInt()
    val sb = StringBuilder()
    for(i in n downTo 1) {
        sb.append(i).append("\n")
    }
    println(sb)
}