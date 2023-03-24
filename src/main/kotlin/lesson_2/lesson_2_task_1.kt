package lesson_2

fun main() {

    val countStudents: Float = 4f
    val score1: Int = 3
    val score2: Int = 4
    val score3: Int = 3
    val score4: Int = 5

    val averageScore = (score1 + score2 + score3 + score4) / countStudents

    println(String.format("%.2f", averageScore))

}