fun main() {
    var result = listOf(1,2).fold(10) { total, next ->
        println("$total ... $next")
        total + next
    }
    println("fold test: $result")
}