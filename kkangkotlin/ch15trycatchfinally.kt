fun main () {
    try {
        println("try top...")
 
        val data: String = "kkang"
 
        val intData: Int? = data.toInt()
 
        println("try bottom...")
    } catch (e: Exception) {
 
        println("catch ... ${e.toString()}")
 
    }finally {
 
        println("finally....")
    }
 }