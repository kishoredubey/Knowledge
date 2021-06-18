package com.knowledge.array

fun main() {
    val elements = listOf(1, 2, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4)
    println("last index -> ${findLastIndexOf(4, elements)}")
    println("first index -> ${findFirstIndexOf(4, elements)}")
}

fun findLastIndexOf(key: Int, elements: List<Int>): Int {
    var res = -1
    var low = 0
    var high = elements.size - 1
    while (low <= high) {
        val mid = (high + low) / 2
        when {
            key == elements[mid] -> {
                res = mid
                low = mid + 1
            }
            key > elements[mid] -> {
                low = mid + 1
            }
            else -> {
                high = mid - 1
            }
        }
    }
    return res
}

fun findFirstIndexOf(key: Int, elements: List<Int>): Int {
    var low = 0
    var high = elements.size - 1
    var res = -1
    while (low <= high) {
        val mid = (low + high) / 2
        when {
            elements[mid] == key -> {
                res = mid
                high = mid - 1
            }
            elements[mid] > key -> {
                high = mid - 1
            }
            else -> {
                low = mid + 1
            }
        }
    }
    return res
}