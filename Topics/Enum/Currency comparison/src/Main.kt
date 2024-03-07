enum class Country(val currency: String) {
    Germany("Euro"),
    Mali("CFA franc"),
    Dominica("Eastern Caribbean dollar"),
    Canada("Canadian dollar"),
    Spain("Euro"),
    Australia("Australian dollar"),
    Brazil("Brazilian real"),
    Senegal("CFA franc"),
    France("Euro"),
    Grenada("Eastern Caribbean dollar"),
    Kiribati("Australian dollar");

    companion object {
        fun findByCountry(country: String): Country? = values().find { it.name == country }
    }
}

fun main() {
    val (x, y) = readln().split(" ")
    val country1 = Country.findByCountry(x)
    val country2 = Country.findByCountry(y)

    if (country1 != null && country2 != null) {
        print(country1.currency == country2.currency)
    } else print(false)
}