fun main() {
    // Lambda
    val triple: (Int) -> Int = { a: Int -> a * 3}
    println(triple(5))
    println()

    // Higher-order functions
    val peopleNames = listOf("Fred", "Ann", "Barbara", "Joe")
    println(peopleNames.sorted())
    println(peopleNames.sortedWith { str1: String, str2:String -> str1.length - str2.length })
}