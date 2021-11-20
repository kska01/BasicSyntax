package eleven_two_one_three

enum class Direction(var no: Int, val str: String) {
    NORTH(0, "north"), SOUTH(1,"south"),
    WEST(2, "west"), EAST(3, "east")
}

fun main() {
    val direction: Direction = Direction.NORTH

    println("no: ${direction.no}, ${direction.str}")

    direction.no = 10

    println("no: ${direction.no}, ${direction.str}")
}