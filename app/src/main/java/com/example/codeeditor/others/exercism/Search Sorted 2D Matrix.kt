package com.example.codeeditor.others.exercism

// Find position of ele in 2D array
fun main() {
    /* The matrix/array is sorted in both rows and columns.
    Properties:
    - Rows are sorted left to right. (e.g., 1 < 4 < 7 < 11)
    - Columns are sorted top to bottom. (e.g., 1 < 2 < 3 < 10 in column 0)
     */

    val arr = arrayOf(
        arrayOf(1, 4, 7, 11, 5),
        arrayOf(2, 5, 8, 12, 19),
        arrayOf(3, 6, 9, 16, 22),
        arrayOf(10, 13, 14, 17, 24),
        arrayOf(18, 21, 23, 26, 30)
    )
    val ele = 16

    findPosition(arr, ele)
    println(searchSorted2DMatrix(matrix = arr, target = ele))
}

// Both versions provide result and have O(n + m) time complexity, where n is the number of rows
// and m is the number of columns.

/* But this function checks unnecessary columns, "Whenever we move to the next row, there's no need to start
from the last element, as they are unlikely to match the target given the sorted nature of the matrix."

This is because, by moving down, all elements in the new row are guaranteed to be larger
(or smaller, depending on the direction you're moving) than the elements in the previous row,
so starting from the last element is unnecessary and inefficient.
*/
fun findPosition(arr: Array<Array<Int>>, ele: Int) {
    var row = -1
    for (i in arr) {
        row++
        print("$row -> ") // prints traversed row.
        if (i[i.size - 1] >= ele) {
            for (j in (i.size - 1) downTo 0) {
                print("$j ") // prints traversed column.
                when {
                    i[j] == ele -> {
                        println("\n$row $j") // prints position of ele.
                        return
                    }

                    i[j] < ele -> break
                }
            }
        }
        println()
    }
}

// This function overcomes the issue in the above function.
fun searchSorted2DMatrix(matrix: Array<Array<Int>>, target: Int): String {
    val rows = matrix.size
    val cols = matrix.first().size

    var row = 0
    var col = cols - 1

    while (row < rows && col >= 0) {
        println("traversed: $row $col")
        when {
            matrix[row][col] == target -> return "$row, $col"
            matrix[row][col] > target -> col--
            else -> {
                row++
                col = cols - 1
            }
        }
    }

    return "Not Found"
}