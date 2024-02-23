package lesson_2

fun main() {

    val timeStartHour = 9
    val timeStartMinute = 39
    val timeInTravel = 457

    val timeFinishHour = ((timeStartHour * 60 + timeInTravel + timeStartMinute) / 60) % 24
    val timeFinishMinute = (timeStartMinute + timeInTravel) % 60

    println(String.format("Время прибытия поезда: %02d:%02d ", timeFinishHour, timeFinishMinute))

}