package eighteen_two_two_two

@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION,
        AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.EXPRESSION)
@Retention(AnnotationRetention.SOURCE)
annotation class TestAnnotation

@TestAnnotation
class Test {
//    @TestAnnotation constructor(no: Int) { }      Error : no-target

//    @TestAnnotaion                                Error : no-target
    val myval: Int = 10

    @TestAnnotation
    fun myFun(@TestAnnotation no: Int) {
        val result = @TestAnnotation if (no > 10) {
            10
        }else {
            0
        }
    }
}