package lesson_5

fun main() {

    val number1: Int = 1
    val number2: Int = 2
    val sum: Int = number1 + number2

    print("Ведите сумму чисел $number1 и $number2: ")
    val inputNumber = readln().toInt()

    val result = if (sum == inputNumber) "Добро пожаловать!"
    else "Доступ запрещен."

    println()
    println(result)

}