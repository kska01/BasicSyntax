package twelve_two_four

fun main() {

    class User(val name: String, val age: Int)

    val lambdas1: (User) -> Int = { usuer: User -> usuer.age}
    println("lambdas1 return : ${lambdas1(User("kkang", 33))}")

    val lambdas2: (User) -> Int = {it.age}
    println("lambdas2 return : ${lambdas2(User("kkang", 33))}")

    val lambdas3: (User) -> Int = User::age
    println("lambdas3 return : ${lambdas3(User("kkang", 33))}")
}