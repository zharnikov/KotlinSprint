package lesson_1

const val MINUTES_IN_HOR = 60
const val SECONDS_IN_MINUTE = 60

fun main() {

    val secondsInTheSpace = 6480
    val hourInTheSpace = secondsInTheSpace / (MINUTESINHOR * SECONDSINMINUTE)
    val minuteInTheSpace = (secondsInTheSpace % (MINUTESINHOR * SECONDSINMINUTE)) / SECONDSINMINUTE
    val secondInTheSpace = secondsInTheSpace % SECONDSINMINUTE

    println(String.format("%02d:%02d:%02d", hourInTheSpace, minuteInTheSpace, secondInTheSpace))

}