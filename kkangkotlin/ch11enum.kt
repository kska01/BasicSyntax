package eleven_two_one_one

enum class Direction {
    NORTH, SOUTH, WEST, EAST
}
 
fun main() {
    val direction: Direction = Direction.NORTH

    println("${direction.name} ... ${direction.ordinal}")

    val directions: Array<Direction> = Direction.values()
    directions.forEach { t -> println(t.name) }

    val direction1 = Direction.valueOf("WEST")
    println("${direction1.name} .. ${direction1.ordinal}")
}