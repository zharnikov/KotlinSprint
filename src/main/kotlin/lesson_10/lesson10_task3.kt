package lesson_10

fun main() {

    println("Укажите длину пароля:")
    generatePassword(readln().toInt())

}

fun generatePassword(passwordLenght: Int) {

    var userPassword = ""
    val numbers = (0..9)
    val specialSymbols = (32..47).toList()

    for (i in 1..passwordLenght) {

        if (i % 2 == 0) {
            userPassword += specialSymbols[specialSymbols.indices.random()].toChar()
        } else {
            userPassword += numbers.random()
        }

    }

    println(userPassword)

}