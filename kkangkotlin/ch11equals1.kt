package eleven_one_two_two

data class User1(val name: String, val age: Int)

data class Person(val name: String, val age: Int)

fun main() {
    val user = User1("kkang", 20)
    val person = Person("kkang", 20)

    println(user.equals(person))
}