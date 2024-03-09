package lesson_9

import java.util.*

const val NUMBER_OF_PRODUCTS = 5

fun main() {

    val userSet = mutableListOf<String>()

    for (i in NUMBER_OF_PRODUCTS downTo 1) {

        println("Введите элемент для добавления в список:")
        val userProduct = readln().replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
        userSet.add(userProduct)

    }

    println(userSet.sorted().toSet().joinToString() )

}