package math.tabels

class TablesFormat1(TableNumber: Int, Sl_No: Int) : TablesInterface(TableNumber, Sl_No) {

    override fun display() {
        for (i in 1..num2){
            println("$num1 x $i = ${ansArray[i]}")
        }
    }

}