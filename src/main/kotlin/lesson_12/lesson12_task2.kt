package lesson_12

fun main() {

    val day1 = Temperature12(1, 1, false)
    day1.printValues(1, 1, false)

}

class Temperature12(
    val dayTemperature: Int,
    val nightTemperature: Int,
    val isPrecipitation: Boolean
) {


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
