import java.util.*

fun main() {


    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()


    fun count(a: Int, b: Int) {
        if (a < b){
            count(a, b - 1)
            println(b)
        }else if (a > b){
            count(a - 1, b)
            println(a)
        }

    }
    count(a, b)
}

