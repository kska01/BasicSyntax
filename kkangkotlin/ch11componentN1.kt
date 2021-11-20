package eleven_one_two_six

data class User(val name: String, val age: Int)

fun main() {
    val (name, age) = User("kkang", 30)

    println("name: $name, age: $age")

    val user = User("gildong", 30)
    val (name1, age1) = user

    println("name: $name1, age: $age1")
    
}