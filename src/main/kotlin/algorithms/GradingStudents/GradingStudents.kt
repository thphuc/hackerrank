/*
 * Complete the 'gradingStudents' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY grades as parameter.
 */

fun gradingStudents(grades: Array<Int>): Array<Int> {
    val result: Array<Int> = grades
    for (i in grades.indices) {
        if (grades[i] >= 38) {
            val remain = grades[i] % 5
            var nextMultipleOf5 = grades[i]
            if (remain > 0) {
                nextMultipleOf5 = grades[i] + (5 - remain)
            }

            val diff = nextMultipleOf5 - grades[i]
            if (diff < 3) {
                result[i] = nextMultipleOf5
            }
        }
    }

    return  result
}

fun main(args: Array<String>) {
    val gradesCount = readLine()!!.trim().toInt()

    val grades = Array<Int>(gradesCount, { 0 })
    for (i in 0 until gradesCount) {
        val gradesItem = readLine()!!.trim().toInt()
        grades[i] = gradesItem
    }

    val result = gradingStudents(grades)

    println(result.joinToString("\n"))
}
