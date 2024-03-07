package lesson_7

fun main() {

    do {
        val code = (1000..9999).random()
        println("Ваш код авторизации: $code")
        println("Введите код, чтобы авторизироваться:")
        val userCode = readln().toInt()
    } while (code != userCode)
    println("Код введен верно!")

}
