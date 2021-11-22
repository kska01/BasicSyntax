package eleven_three_one

sealed class Shape {
    class Circle(val radius: Double) : Shape()
    class Rect(val width: Int, val height: Int) : Shape()
}

class Triangle(val bottom: Int, val height: Int) : Shape()

fun main() {
    val shape1: Shape = Shape.Circle(10.0)

    val shape2: Shape = Triangle(10, 10)
}