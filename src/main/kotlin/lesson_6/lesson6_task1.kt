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
        var password = readln()

    } while ( password != regPassword )

    println("Авторизация прошла успешно!")

}
