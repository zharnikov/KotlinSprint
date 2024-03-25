package lesson_13

fun main() {

    val listOfContacts = listOf(
        UserValue3("mr. Pink", 1),
        UserValue3("mr. White", 2),
        UserValue3("mr. Orange", 3, "null"),
        UserValue3("mr.Blue", 4, "Avito"),
        UserValue3("mr. Blond", 5, "Ozon"),
    )

    println(listOfContacts.mapNotNull { it.company })

}

class UserValue3(

    val name: String,
    val telNumber: Long,
    val company: String? = null

) {

    fun printUserValue3() {

        println(
            """ 
            - Имя: $name
            - Номер: $telNumber
            - Компания: ${company ?: "<не указано>"}
        """.trimIndent()
        )

    }

}