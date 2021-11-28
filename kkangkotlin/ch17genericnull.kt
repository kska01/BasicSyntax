package seventeen_two_two

class MyClass<T> {
    fun myFun(arg1: T, arg2: T) {
        println(arg1?.equals(arg2))
    }
}

fun main() {
    val obj = MyClass<String>()
    obj.myFun("hello", "hello")

    val obj2 = MyClass<Int?>()
    obj2.myFun(null, 10)
}