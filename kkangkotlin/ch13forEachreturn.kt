fun main() {
    val array = arrayOf(1, -1, 2)
    fun arrayLoop() {
        println("loop top..")
        array.forEach {
            if(it < 0) return
            println(it)
        }
        println("loop bottom..")
    }
    arrayLoop()
}