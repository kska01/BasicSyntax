fun main() {
    var num2 = readLine()!!.toInt()
    
    val getMessage = lambda@ { num: Int ->
        if(num !in 1..100) {
            return@lambda "Error"
        }
        "Success"
    }
    val result = getMessage(num2)

    println(result)
}