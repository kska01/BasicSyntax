package eighteen_two_two

annotation class TestAnnotation(val count: Int)

class Test {

    @TestAnnotation(count = 3)
    fun some() {
        println("some.....")
    }
}

fun main() {

    val obj: Test = Test()

    val methods = Test::class.java!!.methods

    for(method in methods) {
        if(method.isAnnotationPresent(TestAnnotation::class.java)){
            val annotation = method.getAnnotation(TestAnnotation::class.java)
            val count = annotation.count
            for(i in 1..count) {
                obj.some()
            }
        }
    }
}