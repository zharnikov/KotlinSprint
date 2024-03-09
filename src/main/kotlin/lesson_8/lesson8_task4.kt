package lesson_8

fun main() {

    val productsForLasagna = mutableListOf("макароны", "фарш", "сыр")
    println("Ингридиенты для лазаньи: ${productsForLasagna.joinToString(", ")}.")

    println("Укажите ингредиент, который хотите убрать:")
    val userProductToDelete = readln()
    val numOfDeletedProduct = productsForLasagna.indexOf(userProductToDelete)

    if (productsForLasagna.contains(userProductToDelete)) {

        println("Какой ингридиент вы хотите добавить?")
        val userProductToAdd = readln()
        productsForLasagna[numOfDeletedProduct] = userProductToAdd

        println("Готово! Вы сохранили следующий список: ${productsForLasagna.joinToString(", ")}.")

    } else println("Такого элемента нет в списке!")

}
