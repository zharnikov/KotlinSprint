package lesson_3

fun main() {

    val move = "D2-D4;0"
    val moveValues = move.split("-", ";")
    val moveFrom = moveValues[0]
    val moveTo = moveValues[1]
    val numberOfMove = moveValues[2]

    println(moveFrom)
    println(moveTo)
    println(numberOfMove)

}