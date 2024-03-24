package lesson_13

fun main() {


    println("Введите имя:")
    val name = readln()
    println("Введите номер телефона:")
    val telNumber = readln().toLong()
    println("Введите имя компании:")
    val company = readln()

    val contact1 = UserValue4(name = name, telNumber = telNumber, company = company )


}

class UserValue4(

    val name: String,
    val telNumber: Long,
    val company: String?

) {

    init {

        println(
            """ 
            - Имя: $name
            - Номер: $telNumber
            - Компания: ${company ?: "<не указано>"}
        """.trimIndent()
        )

    }


//    val listOfContacts = listOf(
//        UserValue4("mr. Pink", 1),
//        UserValue4("mr. White", 2),
//        UserValue4("mr. Orange", 3, "null"),
//        UserValue4("mr.Blue", 4, "Avito"),
//        UserValue4("mr. Blond", 5, "Ozon"),
//    )
//
//    println(listOfContacts.mapNotNull { it.company })

}