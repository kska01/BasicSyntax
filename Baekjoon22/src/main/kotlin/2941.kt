fun main() {
    val str = readln()
    var result = 0
    for (v in str) {
        result += when (v) {
            '-' -> 0
            '=' -> 0
            else -> 1
        }
    }
    for (i in 0..str.length - 3) {
        if (str[i] == 'd' && str[i + 1] == 'z' && str[i + 2] == '=') result--
    }
    for (i in 0..str.length - 2) {
        if (str[i] == 'l' && str[i + 1] == 'j') result--
        if (str[i] == 'n' && str[i + 1] == 'j') result--
    }
    println(result)
}