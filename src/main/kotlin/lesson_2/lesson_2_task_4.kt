package lesson_2

fun main() {

    val bonus: Int = 20
    val crystals: Int = 7
    val ironstone: Int = 11

    val bonusCrystal: Int = crystals * bonus / 100
    val bonusIronstone: Int = ironstone * bonus / 100

    println("Количество бонусных кристаллов: $bonusCrystal")
    println("Количество бонуса железной руды: $bonusIronstone")

}