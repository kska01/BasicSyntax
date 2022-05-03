import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val dice1 = sc.nextInt()
    val dice2 = sc.nextInt()
    val dice3 = sc.nextInt()
    var sameNumber = 0
    var maxNumber = 0

    if (dice1 == dice2 && dice1 == dice3) {
        println(10000 + dice1 * 1000)
    } else if (dice1 == dice2 || dice1 == dice3 || dice2 == dice3) {
        sameNumber = when (dice1) {
            dice2, dice3 -> dice1
            else -> dice2
        }
        println(1000 + sameNumber * 100)
    } else {
        maxNumber = if (dice1 > dice2) dice1 else dice2
        maxNumber = if (maxNumber > dice3) maxNumber else dice3
        println(maxNumber * 100)
    }
}