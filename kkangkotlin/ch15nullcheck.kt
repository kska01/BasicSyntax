package fifteen_one_three

fun main() {

    var data1: String? = "kkang"

    var length2: Int? = data1?.length
    println(length2)

    data1 = null
    length2 = data1?.length
    println(length2)
}