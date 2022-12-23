/*
 * Complete the 'kangaroo' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts following parameters:
 *  1. INTEGER x1
 *  2. INTEGER v1
 *  3. INTEGER x2
 *  4. INTEGER v2
 */

fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {
    if (x1 < x2) {
        if (v1 <= v2) {
            return "NO"
        }
        // v1 > v2
        var newX1 = x1
        var newX2 = x2
        while (newX1 < newX2) {
            newX1 += v1
            newX2 += v2
        }
        if (newX1 == newX2) {
            return "YES"
        }
        return "NO"
    } else if (x1 > x2) {
        if (v1 >= v2) {
            return "NO"
        }
        // v2 > v1
        var newX1 = x1
        var newX2 = x2
        while (newX2 < newX1) {
            newX1 += v1
            newX2 += v2
        }
        if (newX1 == newX2) {
            return "YES"
        }
        return "NO"
    } else {
        if (v1 != v2) {
            return "NO"
        }
        return "YES"
    }
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val x1 = first_multiple_input[0].toInt()

    val v1 = first_multiple_input[1].toInt()

    val x2 = first_multiple_input[2].toInt()

    val v2 = first_multiple_input[3].toInt()

    val result = kangaroo(x1, v1, x2, v2)

    println(result)
}
