package lesson_3

fun main() {

    val move = "D2-D4;0"
    val a = move.split("-", ";")
    val moveFrom = a[0]
    val moveTo = a[1]
    val numberOfMove = a[2]

    println(moveFrom)
    println(moveTo)
    println(numberOfMove)

}