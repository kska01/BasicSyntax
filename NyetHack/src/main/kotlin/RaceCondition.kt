class Weapon(val name: String)
class Player {
    var weapon: Weapon? = Weapon("Ebony Kris")

    fun printWeaponName() {
        weapon?.also {
            println(it.name)
        }
    }
}

fun main() {
    Player().printWeaponName()
}