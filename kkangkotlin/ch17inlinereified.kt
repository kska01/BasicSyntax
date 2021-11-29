inline fun <reified T> some(arg: Any) {
    if(arg is T) {
        println("true")
    }else {
        println("false")
    }
}

fun main() {
    some<String>("hello")
    some<Int>("hello")
}