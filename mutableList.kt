fun main() {
    
    var mutableList = mutableListOf("MON", "TUE", "WED")

    mutableList.add("THU")

    println("mutableList의 첫 번째 값은 ${mutableList.get(0)}입니다.")
    println("mutableList의 두 번째 값은 ${mutableList.get(1)}입니다.")

    var stringList = mutableListOf<String>()

    stringList.add("월")
    stringList.add("화")
    stringList.add("수")

    stringList.set(1, "요일 변경")

    println("stringList에 입력된 두 번째 값은 ${stringList.get(1)}입니다.")

    stringList.removeAt(1)

    println("stringList에 입력된 두 번째 값은 ${stringList.get(1)}입니다.")
    println("stringList에는 ${stringList.size}개의 값이 있습니다.")
}