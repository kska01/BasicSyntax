fun main() {
    val num = readln().toInt()
    val list = MutableList(num) { readln() }
    var result = num
    for (word in list) {
        val letterList = mutableListOf<Char>()
        var count = 0
        for ((index, letter) in word.withIndex()) {
            if (!letterList.contains(letter)) {
                letterList.add(letter)
            } else if (letterList.contains(letter)) {
                if (letter != word[index - 1]) count++
            }
            if (count > 0) {
                letterList.clear()
                result--
                break
            }
        }
    }
    println(result)
}