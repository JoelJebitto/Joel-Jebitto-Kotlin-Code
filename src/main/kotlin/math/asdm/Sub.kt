package math.asdm

class Sub(_num1:Int, _num2: Int): _ASMD {
    override fun toString(): String {
        return "Subtracting $num1 to $num2"
    }

    override var num1:Int =_num1
    override var num2:Int = _num2

    override fun ansInt(): Int {
        return num1 - num2
    }

    override fun display() {
        println("Subtracting $num1 by $num2 is ${ansInt()}")
    }

    init {
        display()
    }
}