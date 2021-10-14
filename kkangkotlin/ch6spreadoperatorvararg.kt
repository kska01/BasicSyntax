package six_three_three

fun some(vararg a: String) {
    val iterator = a.iterator()   //iterator 객체로 변형
    while(iterator.hasNext()) {
        println(iterator.next())
    }
    println()
}

fun main() {
    //전개연산자를 배열에 사용
    val array3 = arrayOf<String>("hello", "world")
    some(*array3)

    // 전개연산자를 List에 사용 - list를 array로 바꿔서 사용할 수 있다
    val list3 = listOf<String>("a", "b")
    some(*list3.toTypedArray())
}