import kotlin.math.pow

fun main() {
    val name = readln()
    val value = readln().toInt()

    when (name) {
        "amount" -> println(compoundInterest(amount = value).toInt())
        "percent" -> println(compoundInterest(percent = value).toInt())
        "years" -> println(compoundInterest(years = value).toInt())
    }

}

fun compoundInterest(amount: Int = 1000, percent: Int = 5, years: Int = 10): Double {
    return amount.toDouble() * (1 + percent.toDouble() / 100).pow(years.toDouble())
}
