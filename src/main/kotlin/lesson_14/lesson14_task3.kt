package lesson_14

import kotlin.math.pow

fun main() {

    val listOfFigureValues = mutableListOf(

        Circle("Black", 1.2),
        Circle("White", 1.5),
        Circle("Black", 3.4),
        Rectangle("White", 9.0, 1.3),
        Rectangle("Black", 5.4, 3.2),
        Rectangle("White", 5.3, 2.0)

    )

    println(listOfFigureValues.filter { it.color == "Black" }.sumOf { it.calculationPerimeter() })
    println(listOfFigureValues.filter { it.color == "White" }.sumOf { it.calculationArea() })

}

abstract class Figure {
    abstract val color: String
    abstract fun calculationArea(): Double
    abstract fun calculationPerimeter(): Double
}

class Circle(
    override val color: String,
    private val radius: Double
) : Figure() {

    override fun calculationArea() = Math.PI * radius.pow(2)
    override fun calculationPerimeter() = 2 * Math.PI * radius

}

class Rectangle(
    override val color: String,
    private val width: Double,
    private val height: Double
) : Figure() {

    override fun calculationArea() = width * height
    override fun calculationPerimeter() = (width + height) * 2

}