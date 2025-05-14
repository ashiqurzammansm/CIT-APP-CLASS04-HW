fun main() {
    println("=== WeatherWear Helper (°C) ===")
    print("What’s the temperature right now in Celsius? ")

    val input = readLine()?.toIntOrNull()

    if (input == null) {
        println("Oops! Please enter a valid number for the temperature.")
    } else {
        val advice = clothingTipsCelsius(input)
        println("👕 Suggestion: $advice")
    }
}

fun clothingTipsCelsius(temp: Int): String {
    return when {
        temp < 0 -> "❄️ It's freezing! Wear a heavy coat, gloves, and warm accessories."
        temp in 0..10 -> "🧥 Very cold! You’ll need a warm jacket or coat."
        temp in 11..18 -> "🧶 A bit chilly. A sweater or light jacket is perfect."
        temp in 19..25 -> "🙂 Pleasant weather! Comfortable clothes like a shirt and jeans work well."
        temp > 25 -> "🔥 It’s hot! Wear light clothing and stay hydrated."
        else -> "⚠️ That’s an unusual temperature. Dress appropriately!"
    }
}
