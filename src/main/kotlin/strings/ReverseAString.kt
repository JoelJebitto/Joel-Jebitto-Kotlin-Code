package strings

import java.util.*

class ReverseAString(StringInput: String = "", val getInput: Boolean = false) {
    private var stringInput = ""
    private var stringInputs: String = StringInput

    private var ans: String = ""
    private fun process() {
        if (!getInput) {
            stringInput = stringInputs
        }
        if (getInput) {
            print("Enter the string : ")
            stringInputs = readLine().toString()
            stringInput = stringInputs
        }
        for (i in stringInput.lastIndex downTo 0) {
            ans += stringInput[i]
        }
        display(ans)
    }

    private fun display(StringWord: String) {
        println("$StringWord ")
    }

    init {
        process()
    }
}