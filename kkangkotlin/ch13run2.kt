class User1() {
    var name: String? = null
    var age: Int? = null

    fun sayHello() {
        println("hello $name")
    }
    fun sayInfo() {
        println("i am $name, $age years old")
    }
}

fun main() {
    val user = User1()
    val runResult = user.run {
        name = "kim"
        age = 28
        sayHello()
        sayInfo()
        10 + 20
    }
    println("run result: $runResult")

    val user3 = user.apply {
        name = "park"
        sayHello()
        sayInfo()
    }
    println("user name : ${user.name}, user3 name : ${user3.name}")
    user.name = "aaa"
    user3.name = "bbb"
    println("user name : ${user.name}, user3 name : ${user3.name}")
}