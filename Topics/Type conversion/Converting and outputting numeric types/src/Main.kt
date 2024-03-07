import kotlin.io.*
import kotlin.text.*

fun main() {
    // Read the input number as string

    val numberString: String = readLine()!!

    // Check if the string represents an integer or a floating-point number
    // Remember: an integer will not contain a decimal point (.)

    // Hint: Use 'contains' method of String class to check for decimal point in the string

    // If it's an integer, convert it to a floating-point number and print
    // Hint: Use '.toInt' to convert string to integer
    //       and '.toFloat' to convert integer to float
    // Ensure that decimal part is '.0'

    // If it's a floating-point number, convert it to the nearest integer and print
    // Hint: Use '.toFloat' to convert string to float
    //       and '.roundToInt' to convert float to nearest integer
}