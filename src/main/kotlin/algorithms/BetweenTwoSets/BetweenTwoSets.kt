/*
 * Complete the 'getTotalX' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY a
 *  2. INTEGER_ARRAY b
 */

fun getTotalX(a: Array<Int>, b: Array<Int>): Int {
    val minA = a.min()
    val minB = b.min()

    var count = 0

    for (i in minA!!..minB!!) {
        if (a.all { i % it == 0 } && b.all { it % i == 0 }) {
            count++
        }
    }
    return count
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val m = first_multiple_input[1].toInt()

    val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val brr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val total = getTotalX(arr, brr)

    println(total)
}
