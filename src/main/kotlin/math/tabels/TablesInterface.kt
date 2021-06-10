package math.tabels

interface aB
abstract class TablesInterface(TableNumber: Int, sl_No: Int) {
    var num1 = TableNumber
    var num2 = sl_No
    var ansArray: Array<Int> = arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39,50, 51, 52, 53, 54,55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 89, 90)
    private fun process() {
        for (xx in 0..(ansArray.size - 1)){
            if (num2 == xx){
                for (i in 0..(num2) ){
                    ansArray[i] = i * num1
                }
            }
            else {
                if (ansArray[xx] == ansArray.last()) {
                    println("Pls Enter the correct value")
                }
            }
        }
    }

    abstract fun display()

    init {
        process()
        display()
    }

    override fun toString(): String {
        return ansArray.toString()
    }
}
