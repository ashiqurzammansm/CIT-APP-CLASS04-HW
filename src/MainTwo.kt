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
        in 80..100 -> "A+"
        in 70..79 -> "A"
        in 60..69 -> "A-"
        in 50..59 -> "B"
        in 33..49 -> "F"
        else -> "F"
    }
}