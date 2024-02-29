package lesson_5

const val FIRST_SOLUTION = 28
const val SECOND_SOLUTION = 2

fun main() {

    println("Какой результат вычисления будет у выражения: $FIRST_SOLUTION + $SECOND_SOLUTION ?")
    val answer = readln().toInt()
    if (answer == FIRST_SOLUTION + SECOND_SOLUTION) println("Добро пожаловать!") else println("Доступ запрещен.")

}
