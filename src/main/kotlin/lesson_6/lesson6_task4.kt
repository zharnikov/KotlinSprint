package lesson_6

fun main() {

    val randomNumber = (1..9).random()
    val attemptNumber = 5

    for (i in attemptNumber downTo 1) {

        println("Введите загаданное число, осталось попыток: $i ")
        var userNumber = readln().toInt()

        if (userNumber == randomNumber) {
            println("Это была великолепная игра!")
            break
        }

    }

    println("Было загадано число $randomNumber!")

}
