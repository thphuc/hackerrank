import java.math.BigInteger

/*
 * Complete the 'extraLongFactorials' function below.
 *
 * The function accepts INTEGER n as parameter.
 */

fun extraLongFactorials(n: Int): Unit {
    var result: BigInteger = BigInteger.ONE
    for (i in 1 .. n) {
        result = result.multiply(BigInteger.valueOf(i.toLong()))
    }
    println(result)
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    extraLongFactorials(n)
}
