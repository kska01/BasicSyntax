fun main() {
    val myFirstDice = Dice()
    val diceRoll = myFirstDice.roll()
    println("Your ${myFirstDice.sides} sided dice rolled ${diceRoll}!")    
}

class Dice {
    var sides = 6

    fun roll(): Int {                       // 클래스 내에서 정의된 함수를 메서드라고 한다.
        val randomNumber = (1..6).random()
        return randomNumber
    }
}