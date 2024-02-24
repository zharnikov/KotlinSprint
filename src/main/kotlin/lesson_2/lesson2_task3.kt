package lesson_2

const val HOURS_IN_DAY = 24
const val MINUTE_IN_HOUR = 60


fun main() {

    val timeStartHour = 9
    val timeStartMinute = 39
    val timeInTravel = 457

    val timeFinishHour = ((timeStartHour * MINUTEINHOUR + timeInTravel + timeStartMinute) / MINUTEINHOUR) % HOURSINDAY
    val timeFinishMinute = (timeStartMinute + timeInTravel) % MINUTEINHOUR

    println(String.format("Время прибытия поезда: %02d:%02d ", timeFinishHour, timeFinishMinute))

    println((timeStartMinute + timeInTravel))

}