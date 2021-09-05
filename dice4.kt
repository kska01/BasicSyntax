fun main() {
    val myFirstDice = Dice(6)
    val diceRoll = myFirstDice.roll()
    println("Your ${myFirstDice.numSides} sided dice rolled ${diceRoll}!")

    val mySecondDice = Dice(20)
    println("Your ${mySecondDice.numSides} sided dice rolled ${mySecondDice.roll()}!")
}

class Dice(val numSides: Int) {

    fun roll(): Int {                       // 클래스 내에서 정의된 함수를 메서드라고 한다.
        val randomNumber = (1..numSides).random()
        return randomNumber
    }
}