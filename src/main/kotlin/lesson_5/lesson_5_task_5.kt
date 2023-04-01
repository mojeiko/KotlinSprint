package lesson_5

fun main() {

    val number1: Int = (1..5).random()
    val number2: Int = (1..5).random()

    println("Лотерея \"Угадай два числа!\"\n")

    print("Введите первое число (от 1 до 100): ")
    val inputNumber1 = readln().toInt()

    print("Введите второе число (от 1 до 100): ")
    val inputNumber2 = readln().toInt()

    val compare1 =
        (number1 == inputNumber1 || number1 == inputNumber2) && (number2 == inputNumber1 || number2 == inputNumber2)
    val compare2 =
        (number1 == inputNumber1 || number1 == inputNumber2) || (number2 == inputNumber1 || number2 == inputNumber2)

    val result = when {
        compare1 -> "Поздравляем! Вы выиграли главный приз!\n"
        compare2 -> "Вы выиграли утешительный приз!\n"
        else -> "Неудача! Крутите барабан!\n"
    }

    println(result)
    println("Правильные числа: $number1 и $number2")

}