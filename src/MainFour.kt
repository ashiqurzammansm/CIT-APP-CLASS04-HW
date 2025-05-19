fun main() {
    val balance = 1000.0
    val withdrawalAmount = 500.0

    val isEnoughMoney: Boolean

    if (withdrawalAmount <= balance) {
        isEnoughMoney = true
    } else {
        isEnoughMoney = false
    }

    println("Can withdraw money? " + isEnoughMoney)
}
