package lesson_2

fun main() {

    val startTimeHour: Int = 9
    val startTimeMinute: Int = 39
    val wayTime: Int = 457

    val finishTimeInMinute: Int = startTimeHour * 60 + startTimeMinute + wayTime

    val finishTimeMinute: Int = finishTimeInMinute % 60
    val finishTimeHour: Int = finishTimeInMinute / 60

    println(String.format("%02d:%02d", finishTimeHour, finishTimeMinute))

}