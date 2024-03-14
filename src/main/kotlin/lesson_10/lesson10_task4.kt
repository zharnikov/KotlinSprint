package lesson_10

fun main() {

    var winHumanScore = 0

    do {

        val humanRoll = getDiceScore()
        println("Бросок человека, на костях выпало: $humanRoll")

        val computerRoll = getDiceScore()
        println("Бросок компьютера, на костях выпало: $computerRoll")

        if (humanRoll > computerRoll) {
            winHumanScore += 1
            println("Победило человечество")
        } else if (humanRoll < computerRoll) {
            println("Победила машина")
        } else println("Победила дружба")

        println("Хотите сыграть ещё раунд: да или нет?")
        val userDecision = readln()

    } while (continueTheGame(userDecision))

    println("Спасибо за игру! Вы выиграли партий: $winHumanScore")

}

fun getDiceScore(): Int = (1..6).random()

fun continueTheGame(userDecision: String): Boolean =
    userDecision.equals("да", ignoreCase = true)



