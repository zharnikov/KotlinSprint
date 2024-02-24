package lesson_2

const val hoursInDay = 24
const val minutesInHour = 60


fun main() {

    val timeStartHour = 9
    val timeStartMinute = 39
    val timeInTravel = 457

    val timeFinishHour = ((timeStartHour * minutesInHour + timeInTravel + timeStartMinute) / minutesInHour) % hoursInDay
    val timeFinishMinute = (timeStartMinute + timeInTravel) % minutesInHour

    println(String.format("Время прибытия поезда: %02d:%02d ", timeFinishHour, timeFinishMinute))

    println((timeStartMinute + timeInTravel))

}