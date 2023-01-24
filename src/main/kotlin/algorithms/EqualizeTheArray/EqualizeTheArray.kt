/*
 * Complete the 'equalizeArray' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun equalizeArray(arr: Array<Int>): Int {
    val map = mutableMapOf<Int, Int>()

    for (n in arr) {
        map[n] = map.getOrDefault(n, 0) + 1
    }

    val maxOccurrence = map.maxBy { it.value }?.value ?: 0
    return arr.size - maxOccurrence
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = equalizeArray(arr)

    println(result)
}
