/*
 * Complete the 'miniMaxSum' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun miniMaxSum(arr: Array<Int>): Unit {
    var sum: Long = 0
    var min = arr[0]
    var max = arr[0]
    for (n in arr) {
        sum += n
        if (n < min) {
            min = n
        }
        if (n > max) {
            max = n
        }
    }

    print("${sum - max} ${sum - min}")
}

fun main(args: Array<String>) {
    val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    miniMaxSum(arr)
}
