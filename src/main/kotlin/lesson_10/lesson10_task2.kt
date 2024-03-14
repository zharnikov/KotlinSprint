package lesson_10

fun main() {

    println("Введите логин:")
    val userLogin = readln()

    println("Введите пароль:")
    val userPassword = readln()

    if (checkLengthString(userLogin) && checkLengthString(userPassword)) {
        println("Добро пожаловать!")
    } else println("Логин или пароль недостаточно длинные!")

}

fun checkLengthString(value: String): Boolean = value.length >= MIN_LENGHT

const val MIN_LENGHT = 4