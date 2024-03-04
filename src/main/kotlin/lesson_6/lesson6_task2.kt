package lesson_6

fun main() {

    println("Сколько секунд нужно засечь:")
    val recTime = readln().toInt()
    var recTimeForLoop = recTime

    println("До конца осталось:")
    while (recTimeForLoop > 0) {

        println("${recTimeForLoop--} сек.")
        Thread.sleep(1000)

    }

    println("Прошло $recTime сек.")

}