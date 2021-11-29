package eighteen_one_two

import kotlin.reflect.KClass

open class MyClass

fun someFun(arg: KClass<*>) {
    println("class info........")
    println("isAbstract : ${arg.isAbstract}")
    println("isCompanion : ${arg.isCompanion}")
    println("isData : ${arg.isData}")
    println("isFinal : ${arg.isFinal}")
    println("isInner : ${arg.isInner}")
    println("isOpen : ${arg.isOpen}")
    println("isSealed : ${arg.isSealed}")
}

fun main() {
    someFun(MyClass::class)
}