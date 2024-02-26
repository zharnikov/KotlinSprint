package lesson_4

const val SHIP_DAMAGE = true
const val MIN_CREW = 55
const val MAX_CREW = 70
const val FOOD = 50
const val WEATHER = true

fun main() {

    println(
        "Корабль полностью исправен?\n" +
                "Укажите в формате: true/false "
    )
    val shipDamage = readln().toBoolean()

    println("Укажите количество экипажа:")
    val numberCrew = readln().toInt()

    println("Укажите количество ящиков провизии:")
    val numberFood = readln().toInt()

    println(
        "Благоприятная ли погода?\n" +
                "Укажите в формате: true/false "
    )
    val weatherToday = readln().toBoolean()

    val allowToSail = (shipDamage == SHIP_DAMAGE && (numberCrew in (MIN_CREW + 1)..<MAX_CREW) && numberFood > FOOD)
            || (shipDamage == !SHIP_DAMAGE && numberCrew == MAX_CREW && numberFood >= FOOD && weatherToday == WEATHER)

    println("Разрешение на отправку корабля в долгосрочное плавание: $allowToSail")

}