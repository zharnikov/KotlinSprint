package lesson_10

fun main() {

    val humanRoll = getScoreDice()
    println("Бросок человека, на костях выпало: $humanRoll")
    val computerRoll = getScoreDice()
    println("Бросок компьютера, на костях выпало: $computerRoll")

    if (humanRoll > computerRoll) {
        println("Победило человечество")
    } else if (humanRoll < computerRoll) {
        println("Победила машина")
    } else println("Победила дружба")

}

fun getScoreDice(): Int =  (1..6).random()
