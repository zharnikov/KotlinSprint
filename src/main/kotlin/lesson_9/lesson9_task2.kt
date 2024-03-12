package lesson_9

const val DECISION_TO_ACCESS = "да"

fun main() {

    val listOfProducts = mutableListOf("макароны", "сыр", "фарш")
    println("В рецепте есть базовые ингредиенты: ${listOfProducts.joinToString()}.")

    println("Желаете добавить еще?")
    val userDecision = readln()

    if (userDecision.equals(DECISION_TO_ACCESS, ignoreCase = true)) {

        println("Какой ингредиент вы хотите добавить?")
        val userProduct = readln()
        listOfProducts.add(userProduct)

        println("Теперь в рецепте есть следующие ингредиенты: ${listOfProducts.joinToString()}.")

    }

}
