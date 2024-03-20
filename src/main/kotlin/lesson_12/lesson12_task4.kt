package lesson_12

fun main() {

    val day = Temperature123(300, 500, false)

}

const val CELSIUS = 273.15

class Temperature123(

    dayTemperature: Int,
    nightTemperature: Int,
    isPrecipitation: Boolean

) {

    private val dayTemperatureCelsius = (dayTemperature - CELSIUS).toInt()
    private val nightTemperatureCelsius = (nightTemperature - CELSIUS).toInt()
    private val isPrecipitationCelsius = isPrecipitation

    init {

        println(
            """
        Дневная температура: $dayTemperatureCelsius
        Ночная температура: $nightTemperatureCelsius
        Наличие осадков в течении суток: $isPrecipitationCelsius        
    """.trimIndent()
        )

    }

}