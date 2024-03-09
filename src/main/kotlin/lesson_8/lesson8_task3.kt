package lesson_8

fun main() {

    val productsForLasagna = arrayOf("Макароны", "Фарш", "Сыр")

    println("Какой ингридиент Вы хотите найти ?")
    val userProduct = readln()

    if (productsForLasagna.contains(userProduct)) {
        println("Ингредиент $userProduct в рецепте есть")
    } else println("Такого ингредиента в рецепте нет")

}
