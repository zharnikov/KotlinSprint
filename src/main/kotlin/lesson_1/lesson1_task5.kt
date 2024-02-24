package lesson_1

const val minutesInHour = 60
const val secondsInMinute = 60

fun main() {

    val secondsInTheSpace = 6480
    val hourInTheSpace = secondsInTheSpace / (minutesInHour * secondsInMinute)
    val minuteInTheSpace = (secondsInTheSpace % (minutesInHour * secondsInMinute)) / secondsInMinute
    val secondInTheSpace = secondsInTheSpace % secondsInMinute

    println(String.format("%02d:%02d:%02d", hourInTheSpace, minuteInTheSpace, secondInTheSpace))

    println((secondsInTheSpace % 3600))

}