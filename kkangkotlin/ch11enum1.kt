package eleven_two_one_two

enum class Direction(val no: Int) {
    NORTH(0), SOUTH(1), WEST(2), EAST(3)
}

fun main() {
    val direction: Direction = Direction.NORTH
    println(Direction.NORTH.no)
}