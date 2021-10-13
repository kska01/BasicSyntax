fun main() {
    var array2 = arrayOfNulls<Any>(3)
    array2[0] = 10
    array2[1] = "hello"
    array2[2] = true
    println("${array2[0]} .. ${array2[1]} .. ${array2[2]}")

    var emptyArray = Array<String>(3, {""})
    emptyArray[0] = "hello"
    emptyArray[1] = "world"
    emptyArray[2] = "kkang"
    println("${emptyArray[0]} .. ${emptyArray[1]} .. ${emptyArray[2]}")
}