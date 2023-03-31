package lesson_5

fun main() {

    val number1: Int = 1
    val number2: Int = 2

    println("Лотерея \"Угадай два числа!\"\n")

    print("Введите первое число (от 1 до 100): ")
    val inputNumber1 = readln().toInt()

    print("Введите второе число (от 1 до 100): ")
    val inputNumber2 = readln().toInt()

    val compare1 = (number1 == inputNumber1 || number1 == inputNumber2) &&
            (number2 == inputNumber1 || number2 == inputNumber2)
    val compare2 = (number1 == inputNumber1 || number1 == inputNumber2) ||
            (number2 == inputNumber1 || number2 == inputNumber2)

    val result = when {
        compare1 -> "Поздравляем! Вы выиграли главный приз!"
        compare2 -> "Вы выиграли утешительный приз!"
        else -> "Неудача! Крутите барабан!"
    }

    println()
    println(result)
    println("Правильные числа: $number1 и $number2")

}