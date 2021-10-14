open class Student (var firstName: String = "",
                    var lastName: String = "",
                    var group: String = "",
                    var averageMark: Double = 0.0) {

    open fun getScholarship() {
        when (averageMark.toInt()) {
            5 -> print("100 UAH")
            else -> print("80 UAH")
        }

    }
}

class Aspirant(firstName: String, lastName: String, group: String, averageMark: Double, sinceWork: String): Student() {

    override fun getScholarship() {
        when (averageMark.toInt()) {
            5 -> println("200 UAH")
            else -> println("180 UAH")
        }
    }

}

fun main() {
    val student = Student("SomeOne", "Smt", "RS1", 5.0)
    val aspirant = Aspirant("fff", "ggg", "hhh", 3.0, "ttt")
    val aspirant1: Student = Aspirant("qqq", "www", "rrr", 5.0, "yes")
    println(aspirant1.getScholarship())
    println(student.firstName)
    var students = mutableListOf<Student>(student, aspirant)
}