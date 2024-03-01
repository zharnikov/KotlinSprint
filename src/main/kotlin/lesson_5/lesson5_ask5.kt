package lesson_5

import kotlin.random.Random

fun main() {

    val randomNumbers = List(3) { Random.nextInt(0, 42) }

    println(
        """
        Здравствуйте! Для того, чтобы выиграть главный приз, Вы должны угадать три числа.
        Они лежат в промежутке от 0 до 42 включительно и являются целыми. 
        Если хотите испытать удачу, то вводите первое число:
    """.trimIndent()
    )
    val firstNumber = readln().toInt()

    println("Вводите второе число:")
    val secondNumber = readln().toInt()

    println("Вводите третье число:")
    val thirdNumber = readln().toInt()

    val usersNumbers = listOf(firstNumber, secondNumber, thirdNumber)
    val coincidences = (randomNumbers intersect usersNumbers).size

    println("Загаданные числа: ${randomNumbers.joinToString()}.")

    when (coincidences) {
        3 -> println("Вы угадали все три и выиграли главный приз!")
        2 -> println("Вы угадали два и выиграли приз!")
        1 -> println("Вы угадали одно и выиграли утишительный приз!")
        else -> println("Вы не угадали, но не растраивайтесь, попробуйте ещё!")
    }

}