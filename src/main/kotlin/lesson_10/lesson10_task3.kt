package lesson_10

fun main() {

    println("Укажите длину пароля:")

    passwordGenerator(readln().toInt())

}

fun passwordGenerator(passwordLenght: Int) {

    var userPassword = ""

    for (i in passwordLenght downTo 1) {

        val numberSymbol = (0..9).random()
        val specialSymbol = "!\"#$%&'()*+,-./".toList().random()

        if (i   % 2 == 0) {
            userPassword += numberSymbol
        } else {
            userPassword += specialSymbol
        }

    }

    println(userPassword)

}