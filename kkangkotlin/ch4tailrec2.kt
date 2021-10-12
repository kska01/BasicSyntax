package com.example.ch4.two 

tailrec fun tailrecPrint(no: Int = 1, count: Int = 1) {
    println("tailecPrint...")
    return if(no == count) return else tailrecPrint(no - 1, count)
}

fun main() {
    tailrecPrint(3)
}