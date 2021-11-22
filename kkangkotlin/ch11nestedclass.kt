package eleven_four_one

class Outer {
    class Nested {
        val name: String = "kkang"
        fun myFun() {
            println("Nested...myFun...")
        }
    }
}

fun main() {
    val obj: Outer.Nested = Outer.Nested()
    println("${obj.name}")
    obj.myFun() 
}