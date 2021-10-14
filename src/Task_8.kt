import java.lang.reflect.Array

abstract class Animal(var food: String, var location: String) {
    open fun makeNoise() {
        println("makeNoise")
    }

    open fun eat() {
        print("eating")
    }

    fun sleep() {
        println("sleeping")
    }
}
class Dog : Animal( "meet", "Che") {
    override fun makeNoise() {
        println("Wroow")
    }

    override fun eat() {
        println("gaw nice")
    }

}
class Cat: Animal("fish", "Kyiv") {
    override fun makeNoise() {
        println("maoo")
    }
    override fun eat() {
        println("moor nice")
    }

}

class Horse: Animal("gras", "Odesa") {
    override fun makeNoise() {
        println("prr")
    }
    override fun eat() {
        println("grrr nice")
    }

}

class Veterinar {
    fun treatAnimal(animal: Animal) {
        println("${animal.food}, ${animal.location}")
    }
}

fun main() {
    val dog = Dog()
    val cat = Cat()
    val horse = Horse()
    val veterinar = Veterinar()
    val arr = arrayOf(dog, cat, horse)
    arr.forEach { i ->
        veterinar.treatAnimal(i)

    }
}