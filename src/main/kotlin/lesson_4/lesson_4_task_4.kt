package lesson_4

fun main() {

    // Проверяю четность дня с прочими параметрами по умолчанию true и с оператором &&,
    // когда в проверке четности дня будет false, тогда и результат по строке будет false.
    val day = 5
    val hands = true
    val legs = true
    val back = true
    val press = true

    println(
        """
Упражнения для рук:      ${hands && day % 2 != 0} 
Упражнения для ног:      ${legs && day % 2 == 0}
Упражнения для спины:    ${back && day % 2 == 0}
Упражнения для пресса:   ${press && day % 2 != 0}
    """.trimIndent()
    )

}