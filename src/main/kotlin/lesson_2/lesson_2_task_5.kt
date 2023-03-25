package lesson_2

import kotlin.math.pow

fun main() {

    // Сумма с капитализацией = Первоначальная сумма * (1 + Ставка/100) ^ кол-во периодов

    val firstSum: Int = 70000
    val depositPercent: Double = 16.7
    val year: Int = 20

    val totalSum = firstSum * (1 + depositPercent / 100).pow(year)

    println(String.format("%.3f", totalSum))

}