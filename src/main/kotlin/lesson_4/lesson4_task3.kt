package lesson_4

const val SUNNY = true
const val TENT_OPEN = true
const val HUMIDITY = 20
const val SEASON = "winter"

fun main() {

    val isSunny = true
    val isTentOpen = true
    val humidityToday = 20
    val seasonToday = "winter"

    val goodConditions =
        SUNNY == isSunny && TENT_OPEN == isTentOpen &&
                HUMIDITY == humidityToday && SEASON != seasonToday

    println("Благоприятные ли условия сейчас для роста бобовых? $goodConditions")

}