fun main() {
    val myFirstDice = Dice()
    println(myFirstDice.sides)
    myFirstDice.roll()    
}

class Dice {
    var sides = 6

    fun roll() {                       // 클래스 내에서 정의된 함수를 메서드라고 한다.
        val randomNumber = (1..6).random()
        println(randomNumber)
    }
}