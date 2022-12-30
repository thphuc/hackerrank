/*
 * Complete the 'designerPdfViewer' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY h
 *  2. STRING word
 */

fun designerPdfViewer(h: Array<Int>, word: String): Int {
    val asciiCodeOfLowercaseA = 97
    var maxHeight = 0
    for (letter in word) {
        val index = letter.code - asciiCodeOfLowercaseA
        if (maxHeight < h[index]) {
            maxHeight = h[index]
        }
    }

    return word.length * maxHeight
}

fun main(args: Array<String>) {

    val h = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val word = readLine()!!

    val result = designerPdfViewer(h, word)

    println(result)
}
