package strings;

import java.util.*

class FindHowMayCapsInAWord {
    init {
        print("Enter THe Word : ")
        val read = Scanner(System.`in`)
        val inputs:String = read.next()
        var ans: Int = 0
        for (i in 0..inputs.lastIndex) {
            if (inputs[i].toString() == inputs[i].uppercase(Locale.getDefault())) {
                ans += 1
            }
        }
        println("There are $ans Cap letters")
    }
}
