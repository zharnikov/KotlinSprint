package lesson_12

import kotlin.random.Random

fun main() {

    val listOfWeatherValue = mutableListOf<WeatherValue>()
    val valueTempratures = (-30..30)

    for (i in 30 downTo 1) {
        listOfWeatherValue.add(
            WeatherValue(
                valueTempratures.random(),
                valueTempratures.random(),
                when ((0..1).random()) {
                    1 -> true
                    else -> false
                }
            )
        )
    }

    val listOfDayTempratures = listOfWeatherValue.map { it.dayTemperature }
    val listOfNightTempratures = listOfWeatherValue.map { it.nightTemperature }
    val listWithPrecipitation = listOfWeatherValue.map { it.isPrecipitation }.filter { it }

    println(
        """
        Средняя температура днём: ${listOfDayTempratures.average().toInt()}
        Средняя температура ночью: ${listOfNightTempratures.average().toInt()}
        Дней с осадками: ${listWithPrecipitation.count()}     
    """.trimIndent()
    )

}

class WeatherValue(

    dayTemperature: Int,
    nightTemperature: Int,
    isPrecipitation: Boolean

) {

    val dayTemperature = dayTemperature
    val nightTemperature = nightTemperature
    val isPrecipitation = isPrecipitation

}
