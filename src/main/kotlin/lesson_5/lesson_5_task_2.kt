package lesson_5

import java.util.*

const val AGE_ADULT = 18
fun main() {

    print("Введите ваш год рождения: ")
    val inputYearOfBirth = readln().toInt()

    val currentDate = Calendar.getInstance()
    val currentYear = currentDate.get(Calendar.YEAR)

    val compareAge = (currentYear - inputYearOfBirth) >= AGE_ADULT

    if (compareAge) println("Показать экран со скрытым контентом.")

}