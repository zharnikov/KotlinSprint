package lesson_5

const val FIRST_CORRECT_NUMBER = 21
const val SECOND_CORRECT_NUMBER = 12

fun main() {

    println(
        """
        Здравствуйте! Для того, чтобы выиграть главный приз, Вы должны угадать два числа.
        Они лежат в промежутке от 0 до 42 включительно и являются целыми. 
        Если хотите испытать удачу, то вводите первое число:
    """.trimIndent()
    )
    val firstUserNumber = readln().toInt()

    println("Вводите второе число:")
    val secondUserNumber = readln().toInt()

    if (firstUserNumber == FIRST_CORRECT_NUMBER && secondUserNumber == SECOND_CORRECT_NUMBER
        || secondUserNumber == FIRST_CORRECT_NUMBER && firstUserNumber == SECOND_CORRECT_NUMBER
    ) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (firstUserNumber == FIRST_CORRECT_NUMBER || secondUserNumber == SECOND_CORRECT_NUMBER
        || secondUserNumber == FIRST_CORRECT_NUMBER || firstUserNumber == SECOND_CORRECT_NUMBER
    ) {
        println("Вы угадали только одно число и выиграли утешительный приз!")
    } else {
        println("Неудача!Попробуйте снова!")
    }

    println("Верные числа: $FIRST_CORRECT_NUMBER и $SECOND_CORRECT_NUMBER")

}