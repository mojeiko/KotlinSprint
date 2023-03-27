package lesson_3

fun main() {

    val response: String = "D2-D4;0"

    val parseText = response.split("-", ";")
    val (moveFrom, moveTo, numMove) = parseText

    println(moveFrom)
    println(moveTo)
    println(numMove)

}