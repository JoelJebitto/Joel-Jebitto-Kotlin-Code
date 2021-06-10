package math.tabels

class TablesFormat2(TableNumber: Int, Sl_No: Int) : TablesInterface(TableNumber, Sl_No) {
    override fun display() {
        for (i in 1..num2) {
            println("$i x $num1 = ${ansArray[i]}")
        }
    }
}
