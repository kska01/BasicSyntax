package six_two_one

fun main() {
    //for 반복
    var sum: Int = 0
    for(i in 1..10) {
        sum += i
    }
    println(sum)
    println()

    //컬렉션 타입 데이터에 의한 반복
    val list = listOf("Hello", "World", "!")
    val sb = StringBuffer()
    for(str in list) {
        sb.append(str)
    }
    println(sb)
    println()

    //indices 사용
    val list1 = listOf("Hello", "World", "!")
    for (i in list1.indices) {
        println(list[i])
    }
    println()

    //withIndex() 이용
    val list2 = listOf("Hello", "World", "!")
    for ((index, value) in list2.withIndex()) {
        println("the element at $index is $value")
    }
    println()

    //for의 다양한 조건
    for(i in 1 until 11 step 2) {
        println(i)
    }
}