// Necessary import
import java.util.*

class CellPhone(val brandName: String, val version: String)

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val brandName = scanner.nextLine()
    val version = scanner.nextLine()


    val phone = CellPhone(brandName, version)

    print("The cell phone is a ${phone.brandName} with version ${phone.version}")
}