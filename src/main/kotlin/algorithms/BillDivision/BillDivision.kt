/*
 * Complete the 'bonAppetit' function below.
 *
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY bill
 *  2. INTEGER k
 *  3. INTEGER b
 */

fun bonAppetit(bill: Array<Int>, k: Int, b: Int): Unit {
    var sharedAmount = 0
    for (i in bill.indices) {
        if (i != k) {
            sharedAmount += bill[i]
        }
    }

    if (sharedAmount / 2 >= b) {
        println("Bon Appetit")
    } else {
        println(b - (sharedAmount / 2))
    }
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val k = first_multiple_input[1].toInt()

    val bill = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val b = readLine()!!.trim().toInt()

    bonAppetit(bill, k, b)
}
