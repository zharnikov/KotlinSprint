package lesson_7

import kotlin.concurrent.thread

fun main() {

    println("Сколько секунд нужно засечь?")
    val userTime = readln().toInt()

    for (i in userTime downTo 0) {

        println("До конца осталось: $i сек.")
        Thread.sleep(1000)

    }

    println("Время вышло!")

}
