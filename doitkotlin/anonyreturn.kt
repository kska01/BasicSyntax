package chap04.secion3.noinline1

fun main() {
    retFun()
}

fun inlineLambda(a: Int, b: Int, out: (Int, Int) -> Unit) {
    out(a, b)
}

fun retFun() {
    println("start of retFunc")
    inlineLambda(13, 3, fun(a, b) { 
        val result = a + b
        if(result > 10) return 
        println("result: $result")
    })
    println("end of retFunc")
}