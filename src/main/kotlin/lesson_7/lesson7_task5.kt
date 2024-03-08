package lesson_7

const val MIN_NUM_PASSWORD = 6
const val MIN_NUM_DIFF_SYMBOLS = 3

fun main() {

    var userPassword = ""
    var userNumPassword: Int
    val randomNumber = (0..9).random()
    val randomLetter = ('a'..'z').random()
    val randomUpperLetter = ('A'..'Z').random()

    do {

        println(
            "Введите количество символов в пароле. Минимально: $MIN_NUM_PASSWORD"
        )
        userNumPassword = readln().toInt()

    } while (userNumPassword < MIN_NUM_PASSWORD)

    userPassword = userPassword + randomNumber + randomLetter + randomUpperLetter

    for (i in (userNumPassword - MIN_NUM_DIFF_SYMBOLS) downTo 1) {

        when ((0..2).random()) {
            1 -> userPassword += randomNumber
            2 -> userPassword += randomLetter
            else -> userPassword += randomUpperLetter
        }

    }

    println("Ваш пароль: $userPassword")

}
