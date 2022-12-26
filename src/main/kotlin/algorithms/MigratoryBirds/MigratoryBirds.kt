/*
 * Complete the 'migratoryBirds' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun migratoryBirds(arr: Array<Int>): Int {
    val map = mutableMapOf<Int, Int>()
    map[1] = 0
    map[2] = 0
    map[3] = 0
    map[4] = 0
    map[5] = 0
    for (i in arr) {
        // Found an id, increase the count of it
        map[i] = map.getValue(i) + 1
    }

    // Return the key of the max value (max count)
    return map.maxBy { it.value }.key
}

fun main(args: Array<String>) {
    val arrCount = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = migratoryBirds(arr)

    println(result)
}
