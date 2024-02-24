package lesson_1

const val MINUTESINHOR = 60
const val SECONDSINMINUTE = 60

fun main() {

    val secondsInTheSpace = 6480
    val hourInTheSpace = secondsInTheSpace / (MINUTESINHOR * SECONDSINMINUTE)
    val minuteInTheSpace = (secondsInTheSpace % (MINUTESINHOR * SECONDSINMINUTE)) / SECONDSINMINUTE
    val secondInTheSpace = secondsInTheSpace % SECONDSINMINUTE

    println(String.format("%02d:%02d:%02d", hourInTheSpace, minuteInTheSpace, secondInTheSpace))

}