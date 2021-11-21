package ten_two_one

interface MyInterface {
    var data1: String
    fun myFun1() {
        //...
    }
    fun myFun2()
}

class MyClass: MyInterface {
    override var data1: String = "hello"
    override fun myFun2() {
        //...
    }
}

fun main() {
//    val obj = myInterface()       <- 에러: 인터페이스는 객체 X
    val obj1 = MyClass()
    obj1.myFun1()
    obj1.myFun2()
}