package lesson_4

const val IS_SUNNY = true
const val IS_TENT_OPEN = true
const val HUMIDITY = 20
const val SEASON = "winter"

fun main() {

    val isSunny = true
    val isTentOpen = true
    val humidityToday = 20
    val seasonToday = "winter"

    val goodConditions =
        IS_SUNNY == isSunny && IS_TENT_OPEN == isTentOpen &&
                HUMIDITY == humidityToday && SEASON != seasonToday

    println("Благоприятные ли условия сейчас для роста бобовых? $goodConditions")

}