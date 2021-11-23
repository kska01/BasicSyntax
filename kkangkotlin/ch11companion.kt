package eleven_five_five

class Outer {
    companion object NestedClass {
        val no: Int = 0
        fun myFun() { }
    }

    fun myFun(){
        no
        myFun()
    }
}

fun main() {
    Outer.NestedClass.no
    Outer.NestedClass.myFun()

    Outer.no
    Outer.myFun()
}