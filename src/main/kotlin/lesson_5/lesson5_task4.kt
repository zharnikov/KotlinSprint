package lesson_5

import java.security.Principal

const val USER_NAME = "Zaphod"
const val PASSWORD = "PanGalactic"

fun main() {

    println("Для входа в систему ведите имя пользователя:")
    val userName = readln()
    if (userName == USER_NAME) {
        println("Введите пароль:")
        val password = readln()
        if (password == PASSWORD) {
            println("Доступ разрешен!")
        } else println("Неверный пароль! В доступе отказано!")
    } else {
        println(
            """
            Такого пользователя в базе нет, нужно зарегистрироваться.
            Введите имя пользователя:
        """.trimIndent()
        )
        val newUser = readln()
        println("Введите пароль:")
        val newPassword = readln()
    }

}