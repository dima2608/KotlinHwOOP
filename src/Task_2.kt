class Person {
    val fullName: String
    val age: Int

    fun move() {
        println("Такой-то  $fullName going")
    }
    fun talk() {
        println("Такой-то  $fullName talking")
    }

    constructor(fullName: String, age: Int){
        this.fullName = fullName
        this.age = age
    }
    constructor(){
        this.fullName = "No name"
        this.age = 0
    }
}

fun main() {
    var person1 = Person()
    var person = Person("Igor", 19)
}