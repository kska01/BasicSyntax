package eleven_four_two

class Outer {
    private var no: Int = 10
    fun outerFun() {
        println("outerFun()...")
    }
    inner class Nested {
        val name: String = "kkang"
        fun myFun() {
            println("Nested..myFun...")
            no = 20
            outerFun()
        }
    }

    fun createdNested(): Nested {
        return Nested()
    }
}

fun main() {
    val obj1: Outer.Nested = Outer().Nested()
    val obj2: Outer.Nested = Outer().createdNested()
}