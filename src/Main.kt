fun main() {
    // Get user input for calculation
    val firstValue = getUserNumber("first")
    val secondValue = getUserNumber("second")
    val operation = getMathOperation()

    // Perform calculation if inputs are valid
    if (firstValue != null && secondValue != null && operation != null) {
        val computationResult = computeValues(firstValue, secondValue, operation)
        println("The answer is: $computationResult")
    } else {
        println("Error: Please check your inputs and try again.")
    }
}

// Function to safely get a number from user
fun getUserNumber(position: String): Double? {
    print("Please type the $position number: ")
    return readLine()?.toDoubleOrNull()
}

// Function to get math operator from user
fun getMathOperation(): Char? {
    print("Select an operation (+, -, *, /): ")
    return readLine()?.firstOrNull()
}

// Function to perform calculations
fun computeValues(value1: Double, value2: Double, operation: Char): Double {
    return when (operation) {
        '+' -> value1.plus(value2)
        '-' -> value1.minus(value2)
        '*' -> value1.times(value2)
        '/' -> if (value2 != 0.0) value1.div(value2) else Double.NaN
        else -> Double.NaN
    }
}