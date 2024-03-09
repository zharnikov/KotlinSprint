package lesson_9

const val NUMBER_OF_PRODUCTS = 5

fun main() {

    println("Введите $NUMBER_OF_PRODUCTS ингридиентов через запятую для сортировки:")
    val userProducts = readln().split(", ").toList().sorted().joinToString()

    println(userProducts)

}