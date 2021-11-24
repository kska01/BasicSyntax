class User() {
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
    val user = User()
    val runResult = user.run {
        name = "kim"
        age = 28
        sayHello()
        sayInfo()
        10 + 20
    }
    println("run result: $runResult")
}