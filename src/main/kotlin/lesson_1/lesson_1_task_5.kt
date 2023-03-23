package lesson_1

fun main() {

    var seconds: Int = 6480
    val minute: Int = 108

    //Остаток секунд
    seconds = 0

    val secondFormat = String.format("%02d", seconds)

    println("$minute:$secondFormat")

}