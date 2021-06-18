package com.knowledge.sorting

/**
 * This is a improved bubble sort algorithm where,
 * the iteration stops if no swaps happen in any iteration.
 */
fun main() {
    println(bubbleIt(arrayListOf(5, 2, 4, 1, 8, 7, 3, 9, 6)))
    println(bubbleIt(arrayListOf(21,85,33,66,94,27,11,)))
}

fun bubbleIt(elements: ArrayList<Int>): ArrayList<Int> {
    var i = 0
    var swapped: Boolean
    while (i < elements.size - 1) {
        var j = 0
        swapped = false
        while (j < elements.size - 1 - i) {
            if (elements[j] > elements[j + 1]) {
                val temp = elements[j + 1]
                elements[j + 1] = elements[j]
                elements[j] = temp
                swapped = true
            }
            j++
        }
        if (!swapped){
            break
        }
        i++
    }
    return elements
}
