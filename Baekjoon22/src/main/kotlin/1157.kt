fun main() {
    val alphabet = ('A'..'Z').toMutableList()
    val list = MutableList(26) {0}
    val str = readln().uppercase()
    var max = 0
    var index = 0
    var count = 0
    for (v in str) {
        list[v - 'A'] += 1
    }
    max = list.maxOrNull()!!
    for (v in list) {
        if (v == max) count++
    }
    if (count == 1) {
        index = list.indexOf(max)
        println(alphabet[index])
    } else println("?")

}