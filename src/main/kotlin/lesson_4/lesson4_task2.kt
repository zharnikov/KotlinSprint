package lesson_4

const val ALLOWABLE_VOLUME = 100
const val MIN_WEIGHT = 35
const val MAX_WEIGHT = 100

fun main() {

    val firstCargoWeight = 20
    val firstCargoVolume = 80
    val secondCargoWeight = 50
    val secondCargoVolume = 100

    println(
        "Груз с весом $firstCargoWeight кг и $firstCargoVolume л соответствует категории 'Average': " +
                "${firstCargoVolume < ALLOWABLE_VOLUME && (firstCargoWeight in MIN_WEIGHT..MAX_WEIGHT)}."
    )
    println(
        "Груз с весом $secondCargoWeight кг и $secondCargoVolume л соответствует категории 'Average': " +
                "${secondCargoVolume < ALLOWABLE_VOLUME && (secondCargoWeight in MIN_WEIGHT..MAX_WEIGHT)}."
    )

}