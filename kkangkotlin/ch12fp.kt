package twelve_one_three

fun superFun() {
    val superData = "hello"
    fun subFun1() {
        println("subFun1() .. superData : ${superData}")
    }

    fun subFun2(a: Int, b: Int): Int {
        subFun1()
        return a + b 
    }

    class SubClass {
        fun classFun() {
            println("classFun() .. superData : ${superData}")
        }
    }
    subFun1()
    SubClass().classFun()
}