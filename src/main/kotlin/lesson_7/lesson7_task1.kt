package lesson_7

fun main() {

    var password = ""
    val numberOfSymbols = 6

    for (i in numberOfSymbols downTo 1) {

        val randomChar = ('a'..'z').random()
        val randomNumber = (0..9).random()

        password += if (i % 2 == 0) {
            randomChar.toString()
        } else {
            randomNumber.toString()
        }

    }

    println(password)

}
