package Task_7.com.company

import Task_7.com.company.details.Engine
import Task_7.com.company.professions.Driver
import Task_7.com.company.vehicles.Car

fun main() {
    val car = Car("Lada", "C", 1045, Driver("Kiril", "P", 2.5), Engine(500, "Lada"))
    car.start()
    println(car.toString())
}