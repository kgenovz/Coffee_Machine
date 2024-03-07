fun validatePassword(password: String): Boolean {
    val lengthCheck = password.length > 4
    if (!lengthCheck) {
        println("Your password should be five or longer characters, please write a new password")
        return false
    } else println("Good password"); return true
}

fun main() {
    var validationResult = false
    while (!validationResult) {
        val password = readln()
        validationResult = validatePassword(password)
    }
}