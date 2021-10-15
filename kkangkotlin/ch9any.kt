package nine_one_one

class Shape {
    var x: Int = 0
    var y: Int = 0
    var name: String = "Rect"

    fun draw() {
        println("draw $name : location : $x, $y")
    }
}

fun main() {
    val obj1: Any = Shape()
    val obj2: Any = Shape()
    val obj3 = obj1
    println("obj1.equals(obj2) is ${obj1.equals(obj2)}")
    println("obj1.equals(obj3) is ${obj1.equals(obj3)}")
}