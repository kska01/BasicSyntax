fun main() {
    val array = arrayOf(1, -1, 2)
    fun arrayLoop() {
        println("loop top..")
        array.forEach aaa@{
            if(it < 0) return@aaa
            println(it)
        }
        println("loop bottom..")
    }
    arrayLoop()
}