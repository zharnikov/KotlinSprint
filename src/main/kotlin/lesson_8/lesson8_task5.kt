package lesson_8

fun main () {

    println("Сколько ингридиентов Вы хотите хранить ?")
    val numberOfProducts = readln().toInt()
    val arrayOfProducts = arrayOfNulls<String>(numberOfProducts)

    for (product in arrayOfProducts.indices) {

        println("Что хотите добавить ?")
        arrayOfProducts[product] = readln()

    }

    println("Ваши ингридиенты:\n${arrayOfProducts.joinToString()}")

}