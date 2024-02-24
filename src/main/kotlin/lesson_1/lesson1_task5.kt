package lesson_1

const val MINUTES_IN_HOR = 60
const val SECONDS_IN_MINUTE = 60

fun main() {

    val secondsInTheSpace = 6480
    val hourInTheSpace = secondsInTheSpace / (MINUTES_IN_HOR * SECONDS_IN_MINUTE)
    val minuteInTheSpace = (secondsInTheSpace % (MINUTES_IN_HOR * SECONDS_IN_MINUTE)) / SECONDS_IN_MINUTE
    val secondInTheSpace = secondsInTheSpace % SECONDS_IN_MINUTE

    println(String.format("%02d:%02d:%02d", hourInTheSpace, minuteInTheSpace, secondInTheSpace))

}