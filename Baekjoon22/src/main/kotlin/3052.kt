fun main() {
    val arr = Array<Int>(10) {0}
    var result = 0
    repeat(10) {
        arr[it] = readln().toInt() % 42
    }
    for (i in 0..9) {
        var count = 0
        for (j in (i + 1)..9) {
            if (arr[i] == arr[j]) count++
        }
        if (count == 0) result++
    }
    println(result)
}