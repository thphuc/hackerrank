/*
 * Complete the 'squares' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER a
 *  2. INTEGER b
 */

fun squares(a: Int, b: Int): Int {
    var count = 0

    var x = 1
    // Ignore all integers that have square less than a
    while (x * x < a) {
        x++
    }

    // Count all the integers that have squares less than b (and greater or equal a)
    while (x * x <= b) {
        count++
        x++
    }
    return count
}

fun main(args: Array<String>) {
    val q = readLine()!!.trim().toInt()

    for (qItr in 1..q) {
        val first_multiple_input = readLine()!!.trimEnd().split(" ")

        val a = first_multiple_input[0].toInt()

        val b = first_multiple_input[1].toInt()

        val result = squares(a, b)

        println(result)
    }
}

