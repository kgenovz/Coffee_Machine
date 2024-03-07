fun main() {
    val fNumber = listOf(0, 1, 2, 3, 5, 8, 13, 21, 34, 55)
    val tNumber = listOf(0, 1, 3, 6, 10, 15, 21, 28, 36, 45)
    val pNumber = listOf(1, 10, 100, 1000, 10000, 100000)


    val input = readln().toInt()

    when (input) {
        in fNumber -> print('F')
        in tNumber -> print('T')
        in pNumber -> print('P')
        else -> print('N')
    }
}