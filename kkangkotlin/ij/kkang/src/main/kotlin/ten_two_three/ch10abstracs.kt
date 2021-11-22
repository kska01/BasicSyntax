package ten_two_three

interface Interface1 {
    fun funA()
}

interface Interface2 {
    fun funA()
}

open abstract class Super2 {
    abstract fun funA()
}

class Sub2: Super2(), Interface1, Interface2 {
    override fun funA() {
<<<<<<< HEAD
        println("Sub2 funA...")
=======
        println("Sub2 funA...")
>>>>>>> 379d7ed4a1420e6dfebb5d96eecdae0c6ac32315
    }
}

fun main() {
    val obj1 = Sub2()
    obj1.funA()
}