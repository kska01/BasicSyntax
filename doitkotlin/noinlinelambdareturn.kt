package chap04.secion3.noinline

fun main() {
    retFun()
}

fun inlineLambda(a: Int, b: Int, out: (Int, Int) -> Unit) {
    out(a, b)
}

fun retFun() {
    println("start of retFunc")
    inlineLambda(13, 3) lit@{ a, b -> 
        val result = a + b
        if(result > 10) return@lit 
        println("result: $result")
    }
    println("end of retFunc")
}