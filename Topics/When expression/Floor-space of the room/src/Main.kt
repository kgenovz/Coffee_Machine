import kotlin.math.sqrt

fun main() {
    val shape = readln()

    when (shape) {
        "triangle" -> {
            val a = readln().toDouble()
            val b = readln().toDouble()
            val c = readln().toDouble()

            val s = (a + b + c) / 2 // Semi-perimeter
            val area = sqrt(s * (s - a) * (s - b) * (s - c)) // Heron's formula

            println(area)
        }
        "rectangle" -> {
            val a = readln().toDouble()
            val b = readln().toDouble()

            val area = a * b

            println(area)
        }
        "circle" -> {
            val r = readln().toDouble()

            val area = 3.14 * (r * r)

            println(area)
        }
    }
}