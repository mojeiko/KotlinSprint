package lesson_4

const val MAX_TABLES = 13

fun main() {

    val currentBookingTables = 13
    val tomorrowBookingTables = MAX_TABLES - 4

// Первое решение было такое
    println(
        "Доступность столиков на сегодня: ${currentBookingTables < MAX_TABLES},\n" +
                "Доступность столиков на завтра: ${tomorrowBookingTables < MAX_TABLES}."
    )

    /*
    Но потом начал буквально воспринимать условие задачи -
    "Напиши программу, которая сообщает информацию о бронировании в момент запроса,
    путем сравнения данных о свободных столах с данными о столах в ресторане."
    И начал делать через вычисление конкретно в сравнении со свободными столиками,
    слишком загоняюсь, в этом моя проблема.*/

    /*
    Второе решение
            println(
                "Доступность столиков на сегодня:" +
                        "${(MAX_TABLES - currentBookingTables) <= MAX_TABLES && (MAX_TABLES - currentBookingTables) != 0},\n" +
                        "Доступность столиков на завтра: " +
                        "${(MAX_TABLES - tomorrowBookingTables) <= MAX_TABLES && (MAX_TABLES - tomorrowBookingTables) != 0}."
            )
    */
}