package five_one_three

fun getLength(obj: Any): Int {
    if(obj is String) {
        return obj.length
    }
    return 0
}

fun main() {
    println(getLength("Hello"))
    println(getLength(10))
}