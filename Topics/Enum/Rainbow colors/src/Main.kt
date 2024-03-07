enum class Rainbow(val color: String) {
    RED("red"),
    ORANGE("orange"),
    YELLOW("yellow"),
    GREEN("green"),
    BLUE("blue"),
    INDIGO("indigo"),
    VIOLET("violet");
    fun getPosition() = this.ordinal + 1

    companion object {
        fun findByColor(color: String): Rainbow? = values().find { it.color == color }
    }
}

fun main() {
    val color = readln()
    val rainbowColor = Rainbow.findByColor(color)
    if (rainbowColor != null) {
        print(true)
    } else {
        println(false)
    }
}