package lesson_13


fun main() {

    val contact1 = UserValue2("Ростислав", 89123456789)
    contact1.printUserValue2()

}

class UserValue2(

    name: String,
    telNumber: Long,
    company: String? = null

) {

    private val name = name
    private val telNumber = telNumber
    private val company = company ?: "<не указано>"

    fun printUserValue2() {

        println(
            """ 
            - Имя: $name
            - Номер: $telNumber
            - Компания: $company
        """.trimIndent()
        )
    }

}