import java.util.Scanner

class Book(val title: String = " ", val author: String = " ", val pages: Int = 0) {
    fun description(): String = "$title by $author has $pages pages"
}

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val book = Book(title = input.nextLine(), author = input.nextLine(), pages = input.nextLine().toInt())
    print(book.description())
}