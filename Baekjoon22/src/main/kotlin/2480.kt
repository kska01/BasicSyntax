import java.util.*

const val NUMBER_OF_DICE = 3
var number = 0
var maxNumber = 0
var sameNumberCount = 0

fun main() {
    val sc = Scanner(System.`in`)
    val number = mutableListOf<Int>()
    repeat(NUMBER_OF_DICE) {
        number.add(sc.nextInt())
    }

    price(checkNumber(number))
}

fun checkNumber(num: MutableList<Int>): Int {
    for (i in 0..1) {
        if (num[i] == num[i + 1]) {
            number = num[i]
            sameNumberCount++
        }
    }
    if (num[0] == num[2]) {
        number = num[2]
        sameNumberCount++
    }
    if (num[0] != num[1] && num[0] != num[2] && num[1] != num[2]) {
        maxNumber = if (num[0] > num[1]) num[0] else num[1]
        maxNumber = if (maxNumber > num[2]) maxNumber else num[2]
        }

    return sameNumberCount
}

fun price(sameNumberCount: Int) {
    when(sameNumberCount) {
        3 -> println(10000 + number * 1000)
        1 -> println(1000 + number * 100)
        else -> println(maxNumber * 100)
    }
}