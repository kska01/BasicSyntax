fun main() {
    val words = listOf("about", "acute", "awesome", "balloon", "best", "brief", "class", "coffee", "creative")
    val filteredWords = words.filter { it.startsWith("b", ignoreCase = true) }
    println(filteredWords)
    val filteredRandomWords = words.filter { it.startsWith("b", ignoreCase = true) }.shuffled()
    println(filteredRandomWords)
    val filteredRandomAFewWords = words.filter { it.startsWith("b", ignoreCase = true) }.shuffled().take(2)
    println(filteredRandomAFewWords)
    val filteredRandomAFewSortedWords =
        words.filter { it.startsWith("b", ignoreCase = true) }.shuffled().take(2).sorted()
    println(filteredRandomAFewSortedWords)
}