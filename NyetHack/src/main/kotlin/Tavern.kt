fun main() {
    var beverage = readLine()
//    beverage = null

    if (beverage != null) {
        beverage = beverage.capitalize()
    } else {
        println("beverage가 null입니다!")
    }

// 위의 if else 구문과 같은 내용의 코드
//    var beverage = readLine()
//    beverage?.let {
//        beverage = it.capitalize()
//    } ?: println("beverage가 null입니다.!")

    val beverageServed: String = beverage ?: "맥주"
    println(beverageServed)
}