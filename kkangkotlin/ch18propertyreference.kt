package eighteen_one_two_two

import kotlin.reflect.KClass
import kotlin.reflect.full.declaredMemberExtensionProperties
import kotlin.reflect.full.declaredMemberProperties
import kotlin.reflect.full.memberProperties

open class SuperClass {
    val superVal: Int = 10
}

class MyClass(val no: Int): SuperClass() {

    val myVal: String = "hello"

    val String.someVal: String
        get() = "world"
}

fun someFun(arg: KClass<*>) {
    val properties = arg.declaredMemberProperties
    println("declaredMemberProperties")
    for(property in properties) {
        println("${property.name}: ${property.returnType} .. ")
    }

    println("memberProperties.....")
    val properties2 = arg.memberProperties
    for (property in properties2) {
        println("${property.name}: ${property.returnType} .. ")
    }

    println("declaredMemberExtensionProperties")
    val properties3 = arg.declaredMemberExtensionProperties
    for (property in properties3) {
        println("${property.name}: ${property.returnType} .. ")
    }
}

fun main() {
    someFun(MyClass::class)
}