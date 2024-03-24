package lesson_13


fun main() {

    val contact1 = UserValue2("Ростислав", 89123456789)
    contact1.printUserValue2()

}

class UserValue2(

    val name: String,
    val telNumber: Long,
    val company: String? = null

) {

    fun printUserValue2() {

        println(
            """ 
            - Имя: $name
            - Номер: $telNumber
            - Компания: ${company ?: "<не указано>"}
        """.trimIndent()
        )

    }

}