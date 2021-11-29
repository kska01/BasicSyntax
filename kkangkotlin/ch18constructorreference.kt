package eighteen_one_two_one

import kotlin.reflect.KClass
import kotlin.reflect.full.primaryConstructor

open class MyClass(no: Int) {
    constructor(no: Int, name: String): this(10) { }
    constructor(no: Int, name: String, email: String): this(10) { }
}

fun someFun(arg: KClass<*>){
    val constructors = arg.constructors
    for (constructor in constructors) {
        print("constructor.......")
        val parameters = constructor.parameters
        for (parameter in parameters) {
            print("${parameter.name}: ${parameter.type} .. ")
        }
        println()
    }

    print("primary constructor.....")
    val primaryConstructor = arg.primaryConstructor
    if (primaryConstructor != null) {
        val parameters = primaryConstructor.parameters
        for(parameter in parameters) {
            print("${parameter.name}: ${parameter.type} .. ")
        }
    }
}

fun main() {
    someFun(MyClass::class)
}