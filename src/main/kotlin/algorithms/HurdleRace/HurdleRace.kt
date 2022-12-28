/*
 * Complete the 'hurdleRace' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER k
 *  2. INTEGER_ARRAY height
 */

fun hurdleRace(k: Int, height: Array<Int>): Int {
    val max = height.max()

    if (k >= max!!) {
        return 0
    }
    return max - k
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val k = first_multiple_input[1].toInt()

    val height = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = hurdleRace(k, height)

    println(result)
}
