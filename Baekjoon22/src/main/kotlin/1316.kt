fun main() {
    val num = readln().toInt()
    var count = 0
    val list = MutableList(num) { readln() }
    for (word in list) {
       count += checkWord(word)
    }
    println(num - count)
}

fun checkWord(word: String): Int {
    var count = 0
    val indexList = mutableListOf<Int>()
    for (letter1 in word) {
        for ((index, letter2) in word.withIndex()) {
            if (letter1 == letter2) indexList.add(index)
        }
        for (i in 0 until indexList.lastIndex) {
            if (indexList[i + 1] - indexList[i] > 1) {
                count++
            }
            if (count > 0) break
        }
        if (count > 0) break
    }
    return count
}