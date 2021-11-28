interface MyInterface1
interface MyInterface2

class MyHandler1: MyInterface1, MyInterface2

class MyHandler2: MyInterface1

class MyClass<T> where T: MyInterface1, T: MyInterface2 {
    //...
}

fun main() {
    val obj = MyClass<MyHandler1>()

//    val obj2 = MyClass<MyHandler2>()   Error : MyHandler2는 MyInterface1만 구현되어 있음.
}