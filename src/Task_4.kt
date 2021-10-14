class Reader(
    val fullName: String,
    val liberyCardNum: Int,
    val faculty: String,
    val dateOfBirth: Long,
    val telephone: String
) {

    fun takeBook() {
        println("$fullName take a book")
    }

    fun returnBook() {
        println("$fullName returned a book")
    }

    fun takeBook(bookAmount: Int) {
        println("$fullName took  $bookAmount books")
    }
    fun takeBook(takenBooks: Array<String>) {
        print("$fullName took books:")
        takenBooks.forEach { i -> print(" $i,")}

    }

    fun takeBook(books: Book) {

    }
}

class Book(name: String, author:String) {
}
fun main() {
    val reader = Reader("Ann", 450, "Eng", 5612783495670986123L,
        "0974541404")
    val book1 = Book("Jules Verne", "Around the World in Eighty Days")
    val book2 = Book("Jules Verne", "Journey to the Center of the Earth")
    val book3 = Book("Jules Verne", "From the Earth to the Moon")
    var books = emptyArray<String>()
    books += "Around the World in Eighty Days"
    books += "Journey to the Center of the Earth"
    books += "From the Earth to the Moon"

   reader.takeBook(books)
}