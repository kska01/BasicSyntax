package com.bignerdranch.nyethack

fun main() {

    Game.play()
}

object Game {
    private val player = Player("Madrigal")
    private var currentRoom: Room = TownSquare()

    init {
        println("방문을 환영합니다.")
        player.castFireball()
    }
    fun play() {
        while (true) {
            println(currentRoom.description())
            println(currentRoom.load())

            //플레이어 상태 출력
            printPlayerStatus(player)

            print("> 명령을 입력하세요: ")
            println("최근 명령: ${readLine()}")
       }
    }

    private fun printPlayerStatus(player: Player) {
        println("(Aura: ${player.auraColor()}) " +
                "(Blessed: ${if (player.isBlessed) "YES" else "NO"})")
        println("${player.name} ${player.formatHealthStatus()}")
    }
}

fun performCombat() {
    println("적군이 없다!")
}

fun performCombat(enemyName: String) {
    println("$enemyName 과 전투를 시작함.")
}

fun performCombat(enemyName: String, isBlessed: Boolean) {
    if (isBlessed) {
        println("$enemyName 과 전투를 시작함. 축복을 받음!")
    } else {
        println("$enemyName 과 전투를 시작함.")
    }
}
