package lesson_7

fun main() {

    println("Все четные числа от нуля до 'Введите число': ")
    val userNumber = readln().toInt()

    for (i in 0..userNumber step 2) {
        println(i)
    }

}
