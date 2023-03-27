package lesson_4

const val MAX_TABLES = 13

fun main() {

    val currentBookingTables = 13
    val tomorrowBookingTables = MAX_TABLES - 4

    println(
        "Доступность столиков на сегодня:" +
                "${(MAX_TABLES - currentBookingTables) <= MAX_TABLES && (MAX_TABLES - currentBookingTables) != 0},\n" +
                "Доступность столиков на завтра: " +
                "${(MAX_TABLES - tomorrowBookingTables) <= MAX_TABLES && (MAX_TABLES - tomorrowBookingTables) != 0}."
    )

}