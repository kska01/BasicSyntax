fun d(num: MutableList<String>): MutableList<Int> {
    val result = mutableListOf<Int>()
    for (i in num) {
        result.add(i.toInt() + (i.sumOf { it.toString().toInt() }))
    }
    return result
}

fun main() = with(System.out.bufferedWriter()) {
    val dNumber: MutableList<Int>
    val num = mutableListOf<String>()
    for (i in 1..10000) {
        num.add(i.toString())
    }

    dNumber = d(num)

    for (v in 1..10000) {
        if (v !in dNumber) write("$v\n")
    }
    flush()
    close()
}