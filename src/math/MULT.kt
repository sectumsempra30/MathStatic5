package math

import java.util.ArrayList

class MULT(first: Function, second: Function) : BinaryFunctions() {

    init {
        this.first = first
        this.second = second
    }

    override fun Calculate(`val`: Double): Double {
        return first!!.Calculate(`val`) * second!!.Calculate(`val`)
    }

    override fun CFunction(): Function {
        val l_r = ArrayList<Function>()
        l_r.add(MULT(first!!.CFunction(), second!!))
        l_r.add(MULT(first!!, second!!.CFunction()))
        return ADD(l_r)
    }
}
