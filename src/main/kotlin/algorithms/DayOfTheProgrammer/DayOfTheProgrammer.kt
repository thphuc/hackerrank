/*
 * Complete the 'dayOfProgrammer' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts INTEGER year as parameter.
 */

fun dayOfProgrammer(year: Int): String {
    if (year == 1918) {
        return "26.09.1918"
    }

    var isLeapYear: Boolean
    if (year <= 1918) {
        isLeapYear = year % 4 == 0
    } else {
        isLeapYear = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)
    }

    var totalDaysInFirst8Month = 243
    if (isLeapYear) {
        totalDaysInFirst8Month = 244
    }

    val programmerDay = 256 - totalDaysInFirst8Month

    return "${programmerDay}.09.${year}"
}


fun main(args: Array<String>) {
    val year = readLine()!!.trim().toInt()

    val result = dayOfProgrammer(year)

    println(result)
}
