package eleven_five_two

interface SomeInterface {
    fun interfaceFun()
}
open class SomeClass {
    fun someClassFun() {
        println("someClassFun...")
    }
}

class Outer {
    val myInner: SomeClass = object : SomeClass(), SomeInterface {
        override fun interfaceFun() {
            println("interfaceFun...")
        }
    }
}

fun main() {
    val obj = Outer()
    obj.myInner.someClassFun()
}