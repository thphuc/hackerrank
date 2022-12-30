/*
 * Complete the 'permutationEquation' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY p as parameter.
 */

fun permutationEquation(p: Array<Int>): Array<Int> {
    val results = Array(p.size) { 0 }
    for (i in 1..p.size) {
        val positionOfI = p.indexOf(i) + 1
        val position = p.indexOf(positionOfI) + 1

        results[i - 1] = position
    }
    return results
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val p = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = permutationEquation(p)

    println(result.joinToString("\n"))
}
