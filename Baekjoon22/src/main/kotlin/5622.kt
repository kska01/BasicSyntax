fun main () {
    var result = 0
    for (v in readln()) {
        when (v) {
            in "ABC" -> result += 3
            in "DEF" -> result += 4
            in "GHI" -> result += 5
            in "JKL" -> result += 6
            in "MNO" -> result += 7
            in "PQRS" -> result += 8
            in "TUV" -> result += 9
            in "WXYZ" -> result += 10
        }
    }
    println(result)
}