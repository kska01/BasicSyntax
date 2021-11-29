package seventeen_four_two_one

fun some(array: MutableList<Int>) {
    array.add(10)
}
fun some1(array: MutableList<out Any?>) {
//    array.add(10)                          Error
}
fun some2(array: MutableList<*>) {
//    array.add(10)                          Error
}
fun main() {
    val list1 = mutableListOf<Int>(10, 20)
    some1(list1)

    val list2 = mutableListOf<Int>(10, 20)
    some2(list2)
}
