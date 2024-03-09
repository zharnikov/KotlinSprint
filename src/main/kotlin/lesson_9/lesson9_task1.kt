package lesson_9

fun main() {

    val listOfProducts = listOf("макароны", "сыр", "фарш")

    println("В рецепте есть следующие ингредиенты:")
    listOfProducts.forEach { product ->
        println(product)
    }

}