package lesson_12

fun main() {

    val day1 = Temperature()
    val day2 = Temperature()

    day1.printValues(10, 5, false)
    day2.printValues(-10, -25, true)

}

class Temperature {

    val dayTemperature = 0
    val nightTemperature = 0
    val isPrecipitation = false

    fun printValues(
        dayTemperature: Int,
        nightTemperature: Int,
        isPrecipitation: Boolean
    ) {
        println(
            """
        Дневная температура: $dayTemperature
        Ночная температура: $nightTemperature
        Наличие осадков в течении суток: $isPrecipitation        
    """.trimIndent()
        )

    }

}