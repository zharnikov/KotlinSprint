package lesson_4

fun main() {

    val dayOfTrain = 6
    val parityOfDay = dayOfTrain % 2 == 0
    val armsDay = !parityOfDay
    val legsDay = parityOfDay
    val backDay = parityOfDay
    val absDay = !parityOfDay

    println(
        """
        Упражнения для рук: $armsDay
        Упражнения для ног: $legsDay
        Упражнения для спины: $backDay
        Упражнения для пресса: $absDay
    """.trimIndent()
    )


}