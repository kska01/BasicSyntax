package com.example.ch4.two

fun loopPrint(no: Int = 1) {
    var count = 1
    while(true) {
        println("loopPrint..")
        if(no == count) return
        else count++
    }
}
fun main(args: Array<String>) {
    loopPrint(3)
}