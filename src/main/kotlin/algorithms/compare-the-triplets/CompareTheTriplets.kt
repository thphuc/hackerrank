/*
 * Complete the 'compareTriplets' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY a
 *  2. INTEGER_ARRAY b
 */

fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    var aPoint = 0
    var bPoint = 0

    for (i in a.indices) {
        if (a[i] > b[i]) {
            aPoint++
        } else if (a[i] < b[i]) {
            bPoint++
        }
    }
    return arrayOf(aPoint, bPoint)
}

fun main(args: Array<String>) {

    val a = readln().trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val b = readln().trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))
}
