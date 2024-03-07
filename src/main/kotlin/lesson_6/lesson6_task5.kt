package lesson_6

fun main() {

    println("Создайте логин:")
    val regLogin = readln()

    println("Придумайте пароль:")
    val regPassword = readln()

    do {

        println("Для входа введите логин:")
        val login = readln()

        println("Введите пароль:")
        val password = readln()

    } while (password != regPassword)

    println("Докажите, что Вы не бот!")

    val attemptNumber = 3

    for (i in attemptNumber downTo 1) {

        val firstNumber = (1..9).random()
        val secondNumber = (1..9).random()
        val value = firstNumber + secondNumber

        println(
            "Чему равно: $firstNumber + $secondNumber\n" +
                    "Осталось попыток: $i"
        )
        val userValue = readln().toInt()

        if (value == userValue) {
            println("Добро пожаловать!")
            break
        }

        println("Доступ запрещен!")

    }

}
