package lesson_4

fun main() {

    // Использовал оператор && для сравнения, если хоть один параметр будет false,
    // то результат будет false

    val isSunny = true
    val isOpenAwning = true
    val wet: Int = 20
    val season: String = "Winter"

    val result = isSunny && isOpenAwning && (wet == 20) && (season != "Winter")

    println("Благоприятные ли условия сейчас для роста бобовых? $result")

}