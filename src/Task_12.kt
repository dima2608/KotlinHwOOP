class Towar (var name: String, var cena: Int, reiting: Int){

}
class Category(var name:String, var arr: Array<Towar>){

}
class Basket{

}

class User {

}
fun main() {
    val category1 = Category("telephone", arrayOf(Towar("s", 100, 10),
        Towar("g", 99, 9),
        Towar("q", 3, 7)))
}
