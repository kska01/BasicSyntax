fun main() {
    val myFirstDice = Dice()
    println(myFirstDice.sides)
    myFirstDice.roll()
}

class Dice {
    var sides: Int = 6

    fun roll() {
        val randomNumber = (1..6).random()
        println(randomNumber)
    }
}