package lesson_14

fun main() {

    val linerShip = LinerShip(1, 3, 1)
    val cargoShip = CargoShip(1, 1, 3)
    val icebreaker = Icebreaker(1, 1, 1)

}

open class LinerShip(
    val speed: Int,
    val shipСapacity: Int,
    val liftingСapacity: Int,
)

class CargoShip(
    speed: Int,
    shipСapacity: Int,
    liftingСapacity: Int
) : LinerShip(speed, shipСapacity, liftingСapacity)

class Icebreaker(
    speed: Int,
    shipСapacity: Int,
    liftingСapacity: Int,
    val isCrushIce: Boolean = true
) : LinerShip(speed, shipСapacity, liftingСapacity)