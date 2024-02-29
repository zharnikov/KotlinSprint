package lesson_4

const val IS_DAMAGE = false
const val MIN_CREW = 55
const val MAX_CREW = 70
const val FOOD = 50
const val IS_GOOD_WEATHER = true

fun main() {

    println(
        "Корабль полностью исправен?\n" +
                "Укажите в формате: true/false "
    )
    val isDamaged = readln().toBoolean()

    println("Укажите количество экипажа:")
    val numberCrew = readln().toInt()

    println("Укажите количество ящиков провизии:")
    val numberFood = readln().toInt()

    println(
        "Благоприятная ли погода?\n" +
                "Укажите в формате: true/false "
    )
    val isGoodWeather = readln().toBoolean()

    val allowToSail = (isDamaged == !IS_DAMAGE && (numberCrew in MIN_CREW..<MAX_CREW) && numberFood > FOOD)
            || (numberCrew == MAX_CREW && numberFood >= FOOD && isGoodWeather == IS_GOOD_WEATHER)

    println("Разрешение на отправку корабля в долгосрочное плавание: $allowToSail")

}