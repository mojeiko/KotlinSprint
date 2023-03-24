package lesson_1

fun main() {

    var seconds: Int = 6480
    val minute: Int = seconds / 60

    //Остаток секунд
    seconds %= 60

    val secondFormat = String.format("%02d", seconds)

    println("$minute:$secondFormat")

}