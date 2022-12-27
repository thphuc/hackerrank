/*
 * Complete the 'countingValleys' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER steps
 *  2. STRING path
 */

fun countingValleys(steps: Int, path: String): Int {
    var depth = 0
    var foundValleyStart = false
    var foundValleyEnd = false
    var valleyCount = 0
    for (i in 0 until steps) {
        if (path[i] == 'U') {
            depth++
            if (depth == 0) {
                foundValleyEnd = true
            }
        } else if (path[i] == 'D') {
            depth--
            if (depth == -1) {
                foundValleyStart = true
            }
        }

        if (foundValleyStart && foundValleyEnd) {
            valleyCount++
            foundValleyStart = false
            foundValleyEnd = false
        }
    }

    return valleyCount
}

fun main(args: Array<String>) {
    val steps = readLine()!!.trim().toInt()

    val path = readLine()!!

    val result = countingValleys(steps, path)

    println(result)
}
