package lesson_11

fun main() {

    val user1 = UserMain(
        id = 1,
        login = "first",
        password = "1",
        mail = "first@1.ru"
    )

    val user2 = UserMain(
        id = 2,
        login = "second",
        password = "2",
        mail = "second@2.ru"
    )

    user1.printUser()
    user2.printUser()

}


class UserMain(

    val id: Int,
    val login: String,
    val password: String,
    val mail: String,

    ) {

    fun printUser() = println("id: $id, login: $login, password: $password, mail: $mail")

}
