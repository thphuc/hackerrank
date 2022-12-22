/*
 * Complete the 'staircase' function below.
 *
 * The function accepts INTEGER n as parameter.
 */

fun staircase(n: Int): Unit {
    for (i in 0 until n) {
        for (j in 0 until n) {
           if (j < n - 1 - i) {
               print(" ")
           } else {
               print("#")
           }
        }
        println()
    }
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    staircase(n)
}
