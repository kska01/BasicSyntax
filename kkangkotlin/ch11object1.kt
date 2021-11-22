package eleven_five_one_one

class Outer {

    private var no: Int = 0

    var myInner = object {
        val name: String = "kkang"
        fun innerFun() {
            println("innerFun....")
            no++
        }
    }

    fun outerFun() {
        myInner.name
        myInner.innerFun()
    }
}

fun main() {
    val obj = Outer()
    obj.myInner.name
    obj.myInner.innerFun()
}