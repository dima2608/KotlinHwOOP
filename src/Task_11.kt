abstract class Shape {
    var color = "read"
    open fun draw() {
        print("painted")
    }

    fun equals() {

    }
}
class Circle(x: Int, y: Int): Shape(){
    override fun draw() {
        println("Circle printed")
    }
}

class Rectangl(x: Int, y: Int): Shape(){
    override fun draw() {
        println("Rectangl printed")
    }
}

fun main() {
    val circle = Circle(45,54)
    val rectangl = Rectangl(3,9)

    val arr = arrayOf(circle, rectangl)

    arr.forEach { i -> i.draw()}
}
