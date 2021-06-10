package math

import java.math.RoundingMode
import java.text.DecimalFormat
import java.util.*


class Factorials {
    private var arrayAns = arrayOf(0)
    private var arrayAnsStr = arrayOf("")

    private fun getInput(): Int {
        val read = Scanner(System.`in`)
        print("Enter A Number : ")
        return read.nextInt()
    }

    private fun addToArray() {
        for (i in 1..getInput()) {
            arrayAns += i
        }
        ansArrayToString()
    }

    private fun ansArrayToString() {
        for (i in arrayAns.indices) {
            if (i != arrayAns.size - 1) {
                arrayAnsStr += "$i x "
            }
            if (i == arrayAns.size - 1) {
                arrayAnsStr += "$i"
            }
        }
        display()
    }

    private fun display() {
        for (i in 1 until arrayAnsStr.size) {
            if (i != 1) {
                print(arrayAnsStr[i])

            }
        }
        ansMutator()
    }

    private fun ansMutator() {
        var num = 1.0

        var ans:Double = 1.0

        for (i in 1 until arrayAns.size) {
            num *= i
        }

        val df = DecimalFormat("#.###")
        df.roundingMode = RoundingMode.CEILING

        println(" = ${df.format(num)}")
    }

    init {
        addToArray()
    }
}


