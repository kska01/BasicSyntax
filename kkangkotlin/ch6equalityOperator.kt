package six_three_seven

fun main() {
    class User
    //일치 연산자 (일반 객체의 경우)
    val user1 = User()
    val user2 = User()
    val user3 = user1
    println("user1 == user2 is ${user1 == user2}")
    println("user1 === user2 is ${user1 === user2}")
    println("user1 == user3 is ${user1 == user3}")
    println("user1 === user3 is ${user1 === user3}")

    //일반 객체의 null 허용 경우
    val user4 = User()
    val user5: User? = user4
    println("user4 == user5 is ${user4 == user5}")
    println("user4 === user5 is ${user4 === user5}")

    //기초 데이터 타입 객체(Integer)
    val int1 = Integer(10)
    val int2 = Integer(10)
    val int3 = int1
    println("int1 == int2 is ${int1 == int2}")
    println("int1 === int2 is ${int1 === int2}")
    println("int1 == int3 is ${int1 == int3}")
    println("int1 === int3 is ${int1 === int3}")

    //기초 데이터 타입 객체(Int)
    val data1: Int = 10
    val data2: Int = 10
    println("data1 == data2 is ${data1 == data2}")
    println("data1 === data2 is ${data1 === data2}")
}    