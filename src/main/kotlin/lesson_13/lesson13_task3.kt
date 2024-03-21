package lesson_13

fun main() {

    val listOfContacts = listOf(
        UserValue3("mr. Pink", 1),
        UserValue3("mr. White", 2),
        UserValue3("mr. Orange", 3, "null"),
        UserValue3("mr.Blue", 4, "Avito"),
        UserValue3("mr. Blond", 5, "Ozon"),
    )

}

class UserValue3(

    name: String,
    telNumber: Long,
    company: String? = null

) {

    private val name = name
    private val telNumber = telNumber
    private val company = company ?: "<не указано>"

    init {
        println(
            """
            Имя: $name,
            Номер:$telNumber,
            Компания: $company
            
        """.trimIndent()
        )
    }

}