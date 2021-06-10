package strings

import java.util.*

class CapsToSmallAndSmallToCaps {
    init {
        print("Enter THe Word : ")
        val read = Scanner(System.`in`)
        val inputs: String = read.next()
        var ans: String = " "
        for (i in 0..inputs.lastIndex) {
            if (inputs[i].toString() == inputs[i].uppercase(Locale.getDefault())) {
                ans += inputs[i].lowercase(Locale.getDefault())
            }
            if (inputs[i].toString() == inputs[i].lowercase(Locale.getDefault())) {
                ans += inputs[i].uppercase(Locale.getDefault())
            }

        }
        println(ans)
    }
}

