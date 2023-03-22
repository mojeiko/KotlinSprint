package lesson_1

fun main() {

    val year: Int = 1961      //val - нет необходимости менять значение
    var hour: String = "09"   //var - есть необходимость изменить значение
    var minute: String = "07" //var - есть необходимость изменить значение

    println(year)
    println(hour)
    println(minute)

    hour = "10"
    minute = "55"

    println("$hour:$minute")

}