package sixteen_three_two

class ExtensionClass {
    fun some1() {
        println("ExtensionClass some1()")
    }
}

class DispatchClass {
    fun dispatchFun() {
        println("DispatchClass dispatchFun()")
    }

    fun ExtensionClass.some2() {
        some1()
        dispatchFun()
    }

    fun test() {
        val obj: ExtensionClass = ExtensionClass()
        obj.some1()
        obj.some2()
    }
}

fun main() {
    val obj: ExtensionClass = ExtensionClass()
    obj.some1()
//    obj.some2()                              DispatchClass 내부에서만 확장 함수가 적용된다.
    val obj2 = DispatchClass()
    obj2.test()
//    obj2.some2()
}