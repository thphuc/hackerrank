/*
 * Complete the 'angryProfessor' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts following parameters:
 *  1. INTEGER k
 *  2. INTEGER_ARRAY a
 */

fun angryProfessor(k: Int, a: Array<Int>): String {
    var onTimeStudentCount = 0

    for (i in a) {
        if (i <= 0) {
            onTimeStudentCount++
        }
    }

    if (onTimeStudentCount >= k) {
        return "NO"
    }

    return "YES"
}

fun main(args: Array<String>) {
    val t = readLine()!!.trim().toInt()

    for (tItr in 1..t) {
        val first_multiple_input = readLine()!!.trimEnd().split(" ")

        val n = first_multiple_input[0].toInt()

        val k = first_multiple_input[1].toInt()

        val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

        val result = angryProfessor(k, a)

        println(result)
    }
}
