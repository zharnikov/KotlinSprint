package lesson_8

fun main() {

    val productsForLasagna = arrayOf("Макароны", "Фарш", "Сыр")

    println("Какой ингридиент Вы хотите найти ?")
    val userProduct = readln()

    for (i in productsForLasagna) {

        if ( i == userProduct ) {
            println("Ингредиент $userProduct в рецепте есть")
            return
        }

    }

    println("Такого ингредиента в рецепте нет")

}
