package eighteen_one_three_four

import kotlin.reflect.KMutableProperty
import kotlin.reflect.KProperty

val myVal: Int = 10

var myVar: Int = 10

val referenceVal1: KProperty<*> = ::myVal

val referenceVal2: KProperty<*> = ::myVar

//val referenceVal3: KMutableProperty<*> = ::myVal    Error

val referenceVal4: KMutableProperty<*> = ::myVar

fun main() {
    println(::myVal.get())

    ::myVar.set(30)
    println(::myVar.get())
}