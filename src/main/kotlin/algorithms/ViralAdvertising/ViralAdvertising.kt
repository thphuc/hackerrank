/*
 * Complete the 'viralAdvertising' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER n as parameter.
 */

fun viralAdvertising(n: Int): Int {
    var currentDayLikedPeople = kotlin.math.floor(5 * 1.0 / 2).toInt()
    var cumulativeLikes = currentDayLikedPeople

    for (i in 2..n) {
        currentDayLikedPeople = kotlin.math.floor(currentDayLikedPeople * 3.0 / 2).toInt()
        cumulativeLikes += currentDayLikedPeople
    }

    return cumulativeLikes
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val result = viralAdvertising(n)

    println(result)
}
