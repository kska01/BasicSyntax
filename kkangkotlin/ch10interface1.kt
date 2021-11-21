package ten_two_one_four

interface MyInterface10 {
    fun myInterfaceFun()
}

open class Super1 {
    fun mySuperFun() {
        println("mySuperFun()...")
    }
}

class Sub1: Super1(), MyInterface10 {
    override fun myInterfaceFun() {
        println("myInterfaceFun cal....")
    }
}

fun main() {
    val obj1: Sub1 = Sub1()
    val obj2: Super1 = Sub1()
    val obj3: MyInterface10 = Sub1()
    
    // Sub1 타입 객체 이용
    obj1.mySuperFun()
    obj1.myInterfaceFun()
    
    // Super1 타입 객체 이용
    obj2.mySuperFun()
//  obj2.myInterfaceFun()        <- 에러
    
    // MyInterface10 타입 객체 이용
//  obj3.mySuperFun()            <- 에러
    obj3.myInterfaceFun()
}