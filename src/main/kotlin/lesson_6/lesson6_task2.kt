package lesson_6

fun main() {

    println("Сколько секунд нужно засечь:")
    val recTime = readln().toLong()

    Thread.sleep(1000 * recTime)

    println("Прошло $recTime сек.")

}