package lesson_14

fun main() {

    val linerShip = LinerShip2(1, 3, 1)
    val cargoShip = CargoShip2(1, 1, 3)
    val icebreaker = Icebreaker2(1, 1, 1)

    linerShip.printProperties()
    cargoShip.printProperties()
    icebreaker.printProperties()

}

open class LinerShip2(
    val speed: Int,
    val shipСapacity: Int,
    val liftingСapacity: Int,
) {

    open fun printProperties() {
        println(
            """
                
            Параметры корбля:
            - скорость: $speed
            - вместительность: $shipСapacity
            - грузоподъемность: $liftingСapacity
            - метод погрузки: ${shipLoadingType()}            
        """.trimIndent()
        )
    }

    open fun shipLoadingType() = "выдвигает горизонтальный трап со шкафута"

}

class CargoShip2(
    speed: Int,
    shipСapacity: Int,
    liftingСapacity: Int,
) : LinerShip2(speed, shipСapacity, liftingСapacity) {

    override fun shipLoadingType() = "активирует погрузочный кран"
}

class Icebreaker2(
    speed: Int,
    shipСapacity: Int,
    liftingСapacity: Int,
    val isCrushIce: Boolean = true
) : LinerShip2(speed, shipСapacity, liftingСapacity) {

    override fun printProperties() {
        super.printProperties()
        println("- колет лёд: $isCrushIce")

    }

    override fun shipLoadingType() = "открывает ворота со стороны кормы"

}