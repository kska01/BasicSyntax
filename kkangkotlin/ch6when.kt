package six_one_two

fun main() {
    //정수로 분기
    val a2 = 1
    when (a2) {
        1 -> println("a2 == 1")
        2 -> println("a2 == 2")
        else -> {
            println("a2 is neither 1 nor 2")
        }
    }

    //정수 이외의 값, 다양한 타입의 when 조건
    val data1 = "hello"
    when(data1) {
        "hello" -> println("data1 is hello")
        "world" -> println("data1 is world")
        else -> println("data1 is not hello or world")
    }

    //여러 조건을 한꺼번에 명시
    val data2 = 60
    when(data2) {
        10, 20 -> println("data2 is 10 or 20")
        30, 40 -> println("data2 is 30 or 40")
        //some() -> println("data2 is 50")   some() 함수의 반환값이 50 일 때
        30 + 30 -> println("data2 is 60")
    }

    //데이터 범위 조건
    val data3 = 15
    when(data3) {
        !in 1..100 -> println("invalid data")
        in 1..10 -> println("1 <= data3 <= 10")
        in 11..20 -> println("11 <= data3 <= 20")
        else -> println("data3 > 20")
    }

    //집합 데이터로 조건 - when에 지정한 인수가 집합 데이터에 포함되었는지 판단
    val list = listOf<String>("hello", "world", "kkang")
    val array = arrayOf<String>("one", "two", "three")
    val data4 = "kkang"
    when(data4) {
        in list -> println("data4 in list")
        in array -> println("data4 in array")
    }

    //Any에 의한 조건 - 여러 타입으로 분기
    fun testWhen(data: Any) {
        when(data) {
            1 -> println("data value is 1")
            "hello" -> println("data value is hello")
            is Boolean -> println("data type is Boolean")
        }
    }

    //if - else 대체
    val data5 = 15
    when {
        data5 <= 10 -> println("data5 < 10")
        data5 > 10 && data5 <= 20 -> println("10 < data5 <= 20")
        else -> println("data5 > 20")
    }

    //표현식으로서의 when
    val data6 = 3
    val result2 = when(data6) {
        1 -> "1...."
        2 -> "2...."
        else -> {
            println("else....")
            "hello"
        }
    }
    println(result2)
}