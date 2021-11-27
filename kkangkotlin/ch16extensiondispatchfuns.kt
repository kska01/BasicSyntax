class ExtensionClass {
    fun myFun() {
        println("ExtensionClass myFun()")
    }
}

class DispatchClass {
    fun myFun() {
        println("DispatchClass myFun()")
    }

    fun ExtensionClass.some() {
        myFun()
        this.myFun()
        this@DispatchClass.myFun()
    }

    fun test() {
        val obj: ExtensionClass = ExtensionClass()
        obj.some()
    }
}

fun main() {
    val obj: DispatchClass = DispatchClass()
    obj.test()
}