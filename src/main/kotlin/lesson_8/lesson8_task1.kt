package lesson_8

var NUMBERS_OF_DAYS = 7

fun main() {

    val listOfViews = mutableListOf<Int>()

    for (i in NUMBERS_OF_DAYS downTo 1) {

        val randomNumbers = (0.. 100).random()
        listOfViews.add(randomNumbers)

    }

    println(listOfViews.sum())

}