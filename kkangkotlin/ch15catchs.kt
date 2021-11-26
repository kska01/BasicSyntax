fun some(array: Array<Any>) {
    try {
        println("try top...")
        
        val intData: Int = array[0] as Int
        
        val data: String = array[2] as String
        
        val data2: Int = data.toInt()
        
    }catch (e: ClassCastException) {
        println("catch... ClassCastException")
    }catch (e: ArrayIndexOutOfBoundsException) {
        println("catch...ArrayIndexOutOfBoundsException")
    }catch (e: Exception) {
        println("catch... Exception... ${e.toString()}")
    }
}

fun main() {
    //캐스팅 예외
    val array: Array<Any> = arrayOf("0", 1, "6")
    some(array)
    
    //배열 데이터 접근 예외
    val array2: Array<Any> = arrayOf(10, "5")
    some(array2)
    
    //숫자 타입 예외
    val array3: Array<Any> = arrayOf(10, 0, "world")
    some(array3)
}