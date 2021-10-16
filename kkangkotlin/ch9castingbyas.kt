package nine_four_two

open class Super {
    fun superFun() {
        println("superFun()...")
    }
}

class Sub1 : Super() {
    fun subFun1() {
        println("subFun1()...")
    }
}

class Sub2 : Super() {
    fun subFun2() {
        println("subFun2()...")
    }
}

fun main() {
    val obj3: Super = Sub1()
    val obj4: Sub1 = obj3 as Sub1
    obj4.superFun()
    obj4.subFun1()
}