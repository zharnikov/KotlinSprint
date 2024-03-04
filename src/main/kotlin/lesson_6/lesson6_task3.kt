package lesson_6

fun main() {

    println("Сколько секунд нужно засечь:")
    val recTime = readln().toInt()
    var recTimeForLoop = recTime

    while (recTimeForLoop >= 0) {

        println("Осталось секунд: ${recTimeForLoop--}")
        Thread.sleep(1000)

    }

    println("Время вышло")

}