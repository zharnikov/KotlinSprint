package lesson_5

import java.time.LocalDate

const val AGE_OF_MAJORITY = 18
val CURRENT_YEAR = LocalDate.now().year

fun main() {

    println("Введите год своего рождения.")
    val userBirth = readln().toInt()
    if (CURRENT_YEAR - userBirth >= AGE_OF_MAJORITY) println("Показать экран со скрытым контентом.")
    else println("Доступ запрещен!")

}