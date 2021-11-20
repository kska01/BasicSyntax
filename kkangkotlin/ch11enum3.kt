package eleven_two_two 

enum class Direction {
    NORTH {
        override val data1: Int = 10
        override fun myFun() {
            println("north myFun....")
        }
    },
    SOUTH {
        override val data1: Int = 20
        override fun myFun() {
            println("south myFun....")
        }
    };

    abstract val data1: Int
    abstract fun myFun()
}

fun main() {
    val direction: Direction = Direction.NORTH
    println(direction.data1)
    direction.myFun()
}