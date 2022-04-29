fun main() {
    val (a, b, c) = readln().split(' ')
    val d = a.toInt()
    val e = b.toInt()
    val f = c.toInt()
    println((d+e)%f)
    println(((d%f)+(e%f))%f)
    println((d*e)%f)
    println(((d%f)*(e%f))%f)
}