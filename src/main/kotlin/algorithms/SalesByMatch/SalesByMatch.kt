/*
 * Complete the 'sockMerchant' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. INTEGER_ARRAY ar
 */

fun sockMerchant(n: Int, ar: Array<Int>): Int {
    // Create a map, key = color (number)
    val map = mutableMapOf<Int, Int>()
    var pairCount = 0

    for (i in 0 until n) {
        if (map.containsKey(ar[i])) {
            pairCount++
            // Remove the entry to indicate that we will need 2 more socks to have a new pair
            map.remove(ar[i])
        } else {
            // Add the entry to indicate that we will need one more sock to have a new pair
            map[ar[i]] = 1
        }
    }
    return pairCount
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val ar = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = sockMerchant(n, ar)

    println(result)
}
