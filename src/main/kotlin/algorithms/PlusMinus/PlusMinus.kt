import java.math.RoundingMode
import java.text.DecimalFormat

/*
 * Complete the 'plusMinus' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun plusMinus(arr: Array<Int>): Unit {
    // Write your code here
    var positiveCount = 0
    var negativeCount = 0
    var zeroCount = 0

    for (n in arr) {
        if (n > 0) {
            positiveCount += 1
        } else if (n < 0) {
            negativeCount += 1
        } else {
            zeroCount += 1
        }
    }

    val df = DecimalFormat("#.######")
    println(df.format(positiveCount * 1.0 / arr.size))
    println(df.format(negativeCount * 1.0 / arr.size))
    println(df.format(zeroCount * 1.0 / arr.size))
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    plusMinus(arr)
}
