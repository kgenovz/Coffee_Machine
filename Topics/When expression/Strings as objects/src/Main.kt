fun main() {
    val input = readln()

    when {
        input.isEmpty() -> println(input) // Handle empty input
        input.first() == 'i' -> {
            val result = input.drop(1).toInt() + 1
            println(result)
        }
        input.first() == 's' -> {
            val result = input.drop(1).reversed()
            println(result)
        }
        else -> println(input)
    }
}