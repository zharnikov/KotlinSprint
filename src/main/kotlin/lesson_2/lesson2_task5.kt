package lesson_2

import kotlin.math.pow

fun main() {

    val contribution = 70000
    val interestRate = 16.7
    val depositTerm = 20
    val totalSum = (contribution * (1 + (interestRate / 100)).pow(depositTerm))

    println(String.format("%.3f", totalSum))

}