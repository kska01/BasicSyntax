package com.example.ch4.two 

fun recPrint(no: Int = 1, count: Int = 1) {
    println("recPrint...")
    return if(no === count) return else recPrint(no - 1, count)
}

fun main() {
    recPrint(3)
}