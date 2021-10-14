package Task_7.com.company.vehicles

import Task_7.com.company.details.Engine
import Task_7.com.company.professions.Driver

data class Car(val manufacturer: String,
               val class_: String,
               val weight: Int,
               val driver: Driver,
               val engine: Engine) {

    fun start() {
        println("wroom and go")

    }
    fun stop() {
        println("stop")

    }
    fun turnRight() {
        println("turning right")

    }
    fun turnLeft(){
        println("turning left")
    }
}
class Lorry{
    var maxWeight = 9000
}
class SportCar{
    var maxSpeed = 300
}