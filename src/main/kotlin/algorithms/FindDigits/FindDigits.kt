/*
 * Complete the 'findDigits' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER n as parameter.
 */

fun findDigits(n: Int): Int {
    val strOfN = n.toString()
    var count = 0
    for (i in strOfN) {
        val num = Character.getNumericValue(i)
        if (num != 0 && n % num == 0) {
            count++
        }
    }
    return count
}

fun main(args: Array<String>) {
    val t = readLine()!!.trim().toInt()

    for (tItr in 1..t) {
        val n = readLine()!!.trim().toInt()

        val result = findDigits(n)

        println(result)
    }
}
