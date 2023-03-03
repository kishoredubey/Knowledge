package com.knowledge.array

import java.util.BitSet
import kotlin.math.roundToInt

fun main() {
    // find a single missing number from the sequence
    /*val arr = arrayOf(1,2,3,4,6)
    val count: Double = 6.0
    val total: Int = (count*((count+1)/2)).roundToInt()
    val sum = arr.sum()
    println("missing number is = ${total - sum}")*/


    // find multiple missing numbers
    val arr2 = arrayOf(1,2,3,4,6)
    val newTotal = 8
    val bitSet = BitSet(newTotal)
    for (number in arr2) {
        bitSet.set(number-1)
    }

    var clearbit = 0
    while (clearbit < newTotal) {
        val bit = bitSet.nextClearBit(clearbit)+1
        println(bit)
        clearbit += bit
    }

}