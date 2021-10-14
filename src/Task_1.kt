fun main() {
    val phone1 = Phone("097568387", "Samsung", 300)
    val phone2 = Phone("097123123", "Nokia", 335)
    val phone3 = Phone("097569645", "LG")

    phone1.receiveCall("Ann")
    phone1.getNumber()
//    println(phone1.weight)

}
class Phone{
    val number: String
    val model: String
    val weight: Int

    fun receiveCall(name: String){
        print("$name is calling")
    }

    constructor(number: String, model: String){
        this.number = number
        this.model = model
        this.weight = 0
    }

    constructor(number: String, model: String, weight: Int){
        this.number = number
        this.model = model
        this.weight = weight

    }
    constructor(){
        this.number = ""
        this.model = ""
        this.weight = 0
    }

    fun getNumber(){
         println(this.number)
    }

}
