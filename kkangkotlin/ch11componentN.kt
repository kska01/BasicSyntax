package eleven_one_two_five

data class User(val name: String, val age: Int)

fun main() {
    var user = User("kkang", 30)

    println(user.component1())
    println(user.component2())
}