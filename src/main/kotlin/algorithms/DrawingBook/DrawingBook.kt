import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.min

/*
 * Complete the 'pageCount' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. INTEGER p
 */

fun pageCount(n: Int, p: Int): Int {
    val turnedPageForwardCount = floor(p * 1.0 / 2)
    val turnedPageBackwardCount =
        // If the total page is even number -> round up, else -> round down
        if (n % 2 == 0) ceil((n - p) * 1.0 / 2) else floor((n - p) * 1.0 / 2)

    return min(turnedPageForwardCount, turnedPageBackwardCount).toInt()
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val p = readLine()!!.trim().toInt()

    val result = pageCount(n, p)

    println(result)
}
