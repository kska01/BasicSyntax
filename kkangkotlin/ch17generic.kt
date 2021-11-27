package seventeen_one_two

class MyClass<T> {
    var info: T? = null
}

fun main() {
    val obj1 = MyClass<String>()
    obj1.info = "hello"

    val obj2 = MyClass<Int>()
    obj2.info = 10
}