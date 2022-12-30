/*
 * Complete the 'saveThePrisoner' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. INTEGER m
 *  3. INTEGER s
 */

fun saveThePrisoner(n: Int, m: Int, s: Int): Int {
    // Find the remaining sweets after N rounds
    val modulo = m % n

    // Start from 1 and have the same sweets for all prisoners
    // The last prisoner will be warned
    if (s - 1 + modulo == 0) {
        return n
    }

    // Start + remaining sweets
    // If > total prisoners -> use modulo to find remainder,
    // else just return start + remaining sweets
    return if ((s - 1) + modulo > n) {
        return ((s - 1) + modulo) % n
    } else {
        return (s - 1) + modulo
    }
}

fun main(args: Array<String>) {
    val t = readLine()!!.trim().toInt()

    for (tItr in 1..t) {
        val first_multiple_input = readLine()!!.trimEnd().split(" ")

        val n = first_multiple_input[0].toInt()

        val m = first_multiple_input[1].toInt()

        val s = first_multiple_input[2].toInt()

        val result = saveThePrisoner(n, m, s)

        println(result)
    }
}
