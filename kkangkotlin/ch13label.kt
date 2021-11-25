inline fun hoTest(argFun: (String) -> Unit) {
    argFun("hello")
    argFun("kim")
    argFun("kkang")
}

fun labelTest() {
    println("test top....")
    hoTest {
        if(it.length < 4) return@hoTest
        println(it)
    }
    println("test bottom....")
}

fun main() {
    labelTest()
}