/*
 * Complete the 'breakingRecords' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY scores as parameter.
 */

fun breakingRecords(scores: Array<Int>): Array<Int> {
    var max = scores[0]
    var min = scores[0]
    var breakMax = 0
    var breakMin = 0

    for (score in scores) {
        if (max < score) {
            max = score
            breakMax++
        }

        if (min > score) {
            min = score
            breakMin++
        }
    }

    return intArrayOf(breakMax, breakMin).toTypedArray()
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val scores = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = breakingRecords(scores)

    println(result.joinToString(" "))
}