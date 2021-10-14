import javax.swing.ImageIcon

class Matrix (columns: Int, rows: Int){
    var arr = Array(rows) { IntArray(columns) }

    fun matrixAddition(matrix: Array<IntArray>): Array<IntArray> {
        arr.forEachIndexed { i, el ->
            el.forEachIndexed { j, elm ->
                matrix[i][j] += arr[i][j]
            }
        }
        return matrix
    }

    fun matrixMult(num: Int): Array<IntArray> {
        arr.forEachIndexed { i, el ->
            el.forEachIndexed { j, elm ->
                arr[i][j] *= num
            }
        }
        return arr
    }

    fun print() {
        arr.forEach { i ->
            i.forEach { j ->
                print("$j\t")
            }
            println()
        }

    }
}

fun main() {
    val matrix = Matrix(3, 3)
    matrix.print()
}