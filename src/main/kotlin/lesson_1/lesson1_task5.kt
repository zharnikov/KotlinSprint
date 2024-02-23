package lesson_1

fun main() {

    val secondsInTheSpace = 6480
    val hourInTheSpace = secondsInTheSpace / 3600
    val minuteInTheSpace = (secondsInTheSpace % 3600) / 60
    val secondInTheSpace = secondsInTheSpace % 60

    println(String.format("%02d:%02d:%02d", hourInTheSpace, minuteInTheSpace, secondInTheSpace))

}