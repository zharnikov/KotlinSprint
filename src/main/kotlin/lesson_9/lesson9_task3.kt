package lesson_9

fun main() {

    val productsForOmelet = listOf(2, 50, 15)

    println("Какое количество порций Вы хотите приготовить?")
    val numberOfPortion = readln().toInt()

    val productsForUserOmelet = productsForOmelet.map { it * numberOfPortion }

    println(
        "На $numberOfPortion порции вам понадобится:\n" +
                "Яиц – ${productsForUserOmelet[0]}шт,\n" +
                "молока – ${productsForUserOmelet[1]}мл,\n" +
                "сливочного масла – ${productsForUserOmelet[2]}мл."
    )

}
