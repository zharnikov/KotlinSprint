package lesson_11

import kotlin.math.log

fun main() {

    val user1 = User(
        id = 1,
        login = "first",
        password = "1",
        mail = "first@1.ru"
    )

    val user2 = User(
        id = 2,
        login = "second",
        password = "2",
        mail = "second@2.ru"
    )

    user1.printUser()
    user2.printUser()

}


class User(

    val id: Int,
    val login: String,
    val password: String,
    val mail: String,

    ) {

    fun printUser() = println("id: $id, login: $login, password: $password, mail: $mail")

}