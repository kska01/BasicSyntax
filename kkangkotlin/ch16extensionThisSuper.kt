package sixteen_one_two

open class Super {
    open fun superFun() {
        println("Super...superFun....")
    }
}

class Sub: Super() {
    var data: Int = 20
    override fun superFun() {
        println("Sub .. superFun....${data}")
    }
    fun some1(data: Int) {
        this.data = data
        superFun()
        super.superFun()
    }
}
//실행 시에 판단하는 것이므로
fun Sub.some2(data: Int) {
    this.data = data
    superFun()
//  super.superFun()   확장 클래스만 인식 가능. 상위 클래스는 인식 불가.
}

fun main() {
    val obj: Sub = Sub()
    obj.some1(10)
    obj.some2(100)
}