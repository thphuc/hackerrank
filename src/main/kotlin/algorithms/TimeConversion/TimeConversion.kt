/*
 * Complete the 'timeConversion' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

fun timeConversion(s: String): String {
    val isAMFormat = s.contains("AM")
    val hour = s.split(":").first()
    var militaryHour = hour
    if (isAMFormat) {
        if (hour == "12") {
            militaryHour = "00"
        }
    } else {
        if (hour != "12") {
            militaryHour = (hour.toInt() + 12).toString().padStart(1, '0')
        }
    }
    return s.replaceFirst(hour, militaryHour)
        .replace("AM", "")
        .replace("PM", "")
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = timeConversion(s)

    println(result)
}
