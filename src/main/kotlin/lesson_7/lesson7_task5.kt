package lesson_7

const val MIN_NUM_PASSWORD = 6

fun main() {

    println("Введите количество символов в пароле. Минимальное значение: $MIN_NUM_PASSWORD ")
    val userNumPassword = readln().toInt()
    var userPassword = ""

    for (i in userNumPassword downTo  1) {

        when ((0..2).random()) {
            0 -> userPassword += (0..9).random()
            1 -> userPassword += ('a'..'z').random()
            else -> userPassword += ('A'..'Z').random()
        }

    }

    println(userPassword)

}
