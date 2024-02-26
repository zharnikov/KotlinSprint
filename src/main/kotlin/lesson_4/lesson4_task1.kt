package lesson_4

const val NUMBER_OF_TABLES = 13

fun main() {

    val reservedTableForToday = 13
    val reservedTableForTomorrow = 9
    println(
        "Доступность столиков на сегодня: ${reservedTableForToday < NUMBER_OF_TABLES} \n" +
                "Доступность столиков на завтра: ${reservedTableForTomorrow < NUMBER_OF_TABLES}"
    )

}