package lesson_10

fun main() {

    val humanRoll = rollOfTheDice()
    println("Бросок человека, на костях выпало: $humanRoll")
    val computerRoll = rollOfTheDice()
    println("Бросок компьютера, на костях выпало: $computerRoll")

    if (humanRoll > computerRoll) {
        println("Победило человечество")
    } else if (humanRoll < computerRoll) {
        println("Победила машина")
    } else println("Победила дружба")

}

fun rollOfTheDice(): Int {

    val randomNumber = (1..6).random()
    return randomNumber

}