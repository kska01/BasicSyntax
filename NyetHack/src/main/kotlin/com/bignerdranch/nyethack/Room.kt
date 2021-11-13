package com.bignerdranch.nyethack

open class Room(val name: String) {
    fun description() = "Room: $name"

    open fun load() = "아무도 여기에 오지 않았습니다..."
}

class TownSquare : Room("Town Square") {
    override fun load() = "당신의 참여를 주민들이 다 함께 환영합니다!"
}