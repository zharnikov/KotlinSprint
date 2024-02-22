package lesson_2

fun main() {

    val crystalReserve: Int = 7
    val ironReserve: Int = 11
    val buff = 0.2

    val crystalResWithBuff = (crystalReserve * buff).toInt()
    val ironResWithBuff = (ironReserve * buff).toInt()

    println("За счет баффа кристальной руды стало на $crystalResWithBuff больше!")
    println("За счет баффа железной руды стало на $ironResWithBuff больше!")

}