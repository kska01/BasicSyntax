package eighteen_one_three_two

fun isOdd(x: Int): Boolean = x % 2 != 0

fun reflectionFun(argFun: (Int) -> Boolean) {
    println("result: ${argFun(3)}")
}

fun main() {
    reflectionFun { n -> isOdd(n)}
    reflectionFun(::isOdd)
}