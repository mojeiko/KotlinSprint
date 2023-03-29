package lesson_4

const val MIN_PERSON = 55
const val MAX_PERSON = 70
const val MIN_FOODS = 50

fun main() {

    print("Поврежден ли у вас корабль? (введите true или false): ")
    val isDamageShip = readln().toBoolean()

    // Если есть повреждения, то нужно спросить, являются ли они минимальными
    // чтобы можно было проверять условие с наличием минимальных повреждений
    // (не могу проверить без этой переменной данное условие по задаче)
    val isMinLevelDamageShip = if (isDamageShip) {
        print("У корабля незначительные повреждения? (введите true или false)):")
        readln().toBoolean()
    } else true // по умолчанию оставляем, что они незначительные, если их даже нет - для второго условия

    print("Введите текущее количество человек экипажа корабля (целое число): ")
    val inputPerson = readln().toInt()

    print("Введите текущее количество ящиков еды (целое число): ")
    val inputFoods = readln().toInt()

    print("Сегодня хорошая погода? (введите true или false): ")
    val isNiceWeather = readln().toBoolean()

    val result = if (
        (!isDamageShip && inputPerson in MIN_PERSON until MAX_PERSON && inputFoods > MIN_FOODS) || // погоду не проверяем для первого условия
        (isMinLevelDamageShip && inputPerson == MAX_PERSON && inputFoods > MIN_FOODS && isNiceWeather)
    ) {
        "Корабль готов к путешествию."
    } else {
        "Корабль не может покинуть порт."
    }

    println(result)

}