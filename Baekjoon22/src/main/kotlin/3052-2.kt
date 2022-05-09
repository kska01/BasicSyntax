fun main() {
    val arr = ArrayList<Int>()
    repeat(10) {
        val remainder = readln().toInt() % 42
        if (!arr.contains(remainder)) arr.add(remainder)
    }
    println(arr.size)
}