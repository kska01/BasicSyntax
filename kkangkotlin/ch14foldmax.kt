fun main() {
    var result = listOf(1, 11, 5).fold(10) { max, next ->
    if (next > max) next else max }

    println("fold test : $result")
}