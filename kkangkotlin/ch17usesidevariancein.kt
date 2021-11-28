package seveteen_four_one

class MyClass<T>(val data: T) {
    fun myFun(): T {
        return data
    }
    fun myFun2(arg: T) {

    }
    fun myFun3(arg: T): T {
        return data
    }
}
fun some(arg: MyClass<in Int>) {
    arg.myFun()
    arg.myFun2(10)
    arg.myFun3(10)
}

fun main() {
    some(MyClass<Number>(10))
    some(MyClass<Int>(10))
}