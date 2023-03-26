package lesson_3

fun main() {

    var numMove: Int = 1
    var moveFrom: String = "E2"
    var moveTo: String = "E4"

    var strSendMove: String = "$moveFrom-$moveTo;$numMove"

    println(strSendMove)

    numMove++
    moveFrom = "D2"
    moveTo = "D3"

    strSendMove = "$moveFrom-$moveTo;$numMove"

    println(strSendMove)

}