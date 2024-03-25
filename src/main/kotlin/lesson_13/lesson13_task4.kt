package lesson_13

fun main() {

    val listOfContacts = mutableListOf<UserValue4>()

    println("Введите имя:")
    val userName = readln()

    println("Введите номер телефона:")
    var userNumber = readln().toLongOrNull()

    if (userNumber == null) {
        while (userNumber == null) {
            println("Номер нужно указать обязательно:")
            userNumber = readln().toLongOrNull()
        }
    }

    println("Введите имя компании:")
    val userCompany = readln().ifEmpty { null }

    listOfContacts.add(UserValue4(name = userName, telNumber = userNumber, company = userCompany))

}

class UserValue4(

    val name: String,
    val telNumber: Long,
    val company: String? = null

) {

    init {

        println(
            """ 
            - Имя: $name
            - Номер: $telNumber
            - Компания: ${company ?: "не указано"}
        """.trimIndent()
        )

    }

}