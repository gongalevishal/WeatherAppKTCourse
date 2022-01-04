package com.ceinsys.weatherappktcourse

import android.util.Log
import java.lang.NumberFormatException

fun main() {

    val op = Operations()
    op minus 5
    print(op.x)

}

class Operations {
    var x = 10;
    infix fun minus(num: Int) {
        this.x = this.x - num
    }
}

