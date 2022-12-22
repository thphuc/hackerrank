/*
 * Complete the 'birthdayCakeCandles' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY candles as parameter.
 */

fun birthdayCakeCandles(candles: Array<Int>): Int {
    var tallest = candles[0]
    var tallestCount = 0

    for (c in candles) {
        if (c > tallest) {
            tallest = c
            // Reset the count when meeting a taller candle
            tallestCount = 1
        } else if (c == tallest) {
            tallestCount++
        }
    }
    return tallestCount
}

fun main(args: Array<String>) {
    val candlesCount = readLine()!!.trim().toInt()

    val candles = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = birthdayCakeCandles(candles)

    println(result)
}
