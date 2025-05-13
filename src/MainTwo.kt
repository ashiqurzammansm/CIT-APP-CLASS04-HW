fun main() {
    print("Input student's score (0-100): ")
    val score = readLine()?.toIntOrNull()

    if (score == null || score !in 0..100) {
        println("Error: Invalid score entered!")
    } else {
        val grade = determineGrade(score)
        println("Grade: $grade")
    }
}

fun determineGrade(score: Int): String {
    return when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        in 60..69 -> "D"
        in 50..59 -> "E"
        else -> "F"
    }
}