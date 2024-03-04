package lesson_6

fun main() {

    println("Сколько секунд нужно засечь:")
    val recTime = readln().toInt()
    var recTimeForLoop = recTime

    while (recTimeForLoop > 0) {

        println("${recTimeForLoop--}")
        Thread.sleep(1000)

    }

    println("Прошло $recTime сек.")

}