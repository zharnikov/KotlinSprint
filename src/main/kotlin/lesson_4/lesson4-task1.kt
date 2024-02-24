package lesson_4

const val NUMBEROFTABLES = 13

fun main() {

    val reservedTableForToday = 13
    val reservedTableForTomorrow = 9
    println(
        "Доступность столиков на сегодня: ${reservedTableForToday < NUMBEROFTABLES} \n" +
                "Доступность столиков на завтра: ${reservedTableForTomorrow < NUMBEROFTABLES}"
    )

}