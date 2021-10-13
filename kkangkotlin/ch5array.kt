package com.example.ch5.two 

fun main() {
    var array = arrayOf(1, "kkang", true)
    array[0] = 10
    array[2] = "world"
    println("${array[0]} .. ${array[1]} .. ${array[2]}")
    println("size : ${array.size} .. ${array.get(0)} .. ${array.get(1)} .. ${array.get(2)}")
}