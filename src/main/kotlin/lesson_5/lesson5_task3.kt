package lesson_5

const val FIRST_CORRECT_NUMBER = 21
const val SECOND_CORRECT_NUMBER = 12

fun main() {

    println(
        """
        Здравствуйте! Для того, чтобы выиграть главный приз, Вы должны угадать два числа.
        Они лежат в промежутке от 0 до 42 включительно и являются целыми. 
        Если хотите испытать удачу, то вводите первое число!
    """.trimIndent()
    )

    val firstUserNumber = readln().toInt()

    if (firstUserNumber == FIRST_CORRECT_NUMBER || firstUserNumber == SECOND_CORRECT_NUMBER) {
        println("Вы угадали первое число! Вводите ещё одно и приз Ваш!")
        val secondNumberForWin = readln().toInt()
        if (secondNumberForWin == FIRST_CORRECT_NUMBER || secondNumberForWin == SECOND_CORRECT_NUMBER) {
            println("Поздравляем! Вы выиграли главный приз!")
        } else println("К сожалению,это не оно! Вы выиграли утешительный приз!")
        println("Верные числа: $FIRST_CORRECT_NUMBER и $SECOND_CORRECT_NUMBER")
    } else {
        println("К сожалению,это не оно! Но если введете второе верно, то утешительный приз Ваш!")
        val secondNumbForSecPlace = readln().toInt()
        if (secondNumbForSecPlace == FIRST_CORRECT_NUMBER || secondNumbForSecPlace == SECOND_CORRECT_NUMBER) {
            println("Вы выиграли утешительный приз!")
        } else println("Неудача!")
        println("Верные числа: $FIRST_CORRECT_NUMBER и $SECOND_CORRECT_NUMBER")
    }

}