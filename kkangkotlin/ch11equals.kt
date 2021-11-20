package eleven_one_two_one

class Product(val name: String, val price: Int)

data class User(val name: String, val age: Int)

fun main() {
    var product = Product("prod1", 100)
    var product1 = Product("prod1", 100)
    println(product.equals(product1))

    var user = User("kkang", 30)
    var user1 = User("kkang", 30)
    println(user.equals(user1))
}