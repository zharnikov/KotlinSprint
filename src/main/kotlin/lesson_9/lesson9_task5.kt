package lesson_9

import java.util.*

fun main() {

    val userSet = sortedSetOf<String>()

    for (i in 5 downTo 1) {

        println("Введите элемент для добавления в список:")
        val userProduct = readln().replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
        userSet.add(userProduct)

    }

    println(userSet.joinToString() )

}