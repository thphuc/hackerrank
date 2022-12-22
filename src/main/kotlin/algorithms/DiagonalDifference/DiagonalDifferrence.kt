/*
 * Complete the 'diagonalDifference' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var leftToRightDiagonalSum = 0
    var rightToLeftDiagonalSum = 0
    val arrSize = arr.size

    for (i in arr.indices) {
        leftToRightDiagonalSum += arr[i][i]
        rightToLeftDiagonalSum += arr[arrSize - 1 - i][i]
    }

    return kotlin.math.abs(leftToRightDiagonalSum - rightToLeftDiagonalSum)
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}