package lesson_11

fun main() {

    val userTwo = User2(
        id = 2,
        login = "two",
        password = "2",
        mail = "two@2.ru",
    )

    userTwo.printUser()
    userTwo.addToBio()
    userTwo.changePassword()
    userTwo.printUser()

}

class User2(

    val id: Int,
    val login: String,
    var password: String,
    val mail: String,
    var bio: String = ""

) {

    fun printUser() = println(
        """
        id: $id,
        login: $login,
        password: $password,
        mail: $mail
        bio: $bio
    """.trimIndent()
    )

    fun addToBio() {
        println("Напишите о себе:")
        bio = readln()
    }

    fun changePassword() {

        do {

            println("Укажите пароль:")
            val oldPassword = readln()

        } while (oldPassword != password)

        println("Укажите новый пароль:")
        password = readln()

        println("Пароль изменён")

    }

}