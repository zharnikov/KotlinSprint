package lesson_6


fun main() {

    println("Создайте логин:")
    val regLogin = readln()

    println("Придумайте пароль:")
    val regPassword = readln()

    println("Для входа введите логин:")
    val login = readln()

    println("Введите пароль:")
    var password = readln()

    if (password == regPassword) {
        println("Авторизация прошла успешно")
    } else {
        do {
            println("Неверный пароль, попробуйте снова:")
            password = readln()
        } while (password != regPassword)
        println("Авторизация прошла успешно")
    }

}

