package five_two_two

fun main() {
    val immutableList: List<String> = listOf("hello", "world")
    println("${immutableList.get(0)} .. ${immutableList.get(1)}")

    val mutableList: MutableList<String> = mutableListOf("hello", "world")
    mutableList.add("kkang")
    mutableList.set(1, "korea")
    println("${mutableList.get(0)} .. ${mutableList.get(1)} .. ${mutableList.get(2)}")

    val arrayList: ArrayList<String> = ArrayList()
    arrayList.add("hello")
    arrayList.add("kkang")
    arrayList.set(1, "world")
    println("${arrayList.get(0)} .. ${arrayList.get(1)}")
}