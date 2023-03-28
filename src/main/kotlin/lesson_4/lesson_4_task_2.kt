package lesson_4

const val MIN_WEIGHT = 35
const val MAX_WEIGHT = 100
const val MAX_VOLUME = 100

fun main() {
    /**Так как по условию должны проверяться два параметра одновременно,
     * поэтому отсутствующий параметр принудительно инициализирован значением 0, и возникла
     * дополнительно проверка условия для объема volume > 0, соответственно при проверке всегда будет false.
     * Либо только при наличии одного входного параметра, отставлять проверку только для него?
     */

    var weight = 50
    var volume = 0

    println(
        "Average для груза с весом $weight кг и объемом $volume л: " +
                "${
                    (weight >= MIN_WEIGHT && weight <= MAX_WEIGHT) && (volume > 0 && volume < MAX_VOLUME)
                }"
    )

    weight = 50
    volume = 80

    println(
        "Average для груза с весом $weight кг и объемом $volume л: " +
                "${
                    (weight >= MIN_WEIGHT && weight <= MAX_WEIGHT) && (volume > 0 && volume < MAX_VOLUME)
                }"
    )

    weight = 0
    volume = 100

    println(
        "Average для груза с весом $weight кг и объемом $volume л: " +
                "${
                    (weight >= MIN_WEIGHT && weight <= MAX_WEIGHT) && (volume > 0 && volume < MAX_VOLUME)
                }"
    )

}