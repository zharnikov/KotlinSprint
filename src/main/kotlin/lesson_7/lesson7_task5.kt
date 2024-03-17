package lesson_7

const val MIN_NUM_PASSWORD = 6
const val MIN_NUM_DIFF_SYMBOLS = 3

fun main() {

    var userPassword = ""
    var userNumPassword: Int
    val numbers = (0..9).toList()
    val letters = ('a'..'z').toList()
    val upperLetters = ('A'..'Z').toList()

    do {

        println(
            "Введите количество символов в пароле. Минимально: $MIN_NUM_PASSWORD"
        )
        userNumPassword = readln().toInt()

    } while (userNumPassword < MIN_NUM_PASSWORD)

    userPassword = userPassword + numbers.random() + letters.random() + upperLetters.random()

    for (i in (userNumPassword - MIN_NUM_DIFF_SYMBOLS) downTo 1) {

        when ((0..2).random()) {

            1 -> userPassword += numbers.random()
            2 -> userPassword += letters.random()
            else -> userPassword += upperLetters.random()

        }

    }

    println("Ваш пароль: ${userPassword.toList().shuffled().joinToString("")}")

}