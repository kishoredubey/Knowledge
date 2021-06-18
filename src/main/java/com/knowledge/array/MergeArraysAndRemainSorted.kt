package com.knowledge.array

fun main() {
    print("resulting array is ${merge(arrayListOf(1, 3, 5, 7, 9), arrayListOf(2, 4, 6, 8))}")
}

fun merge(arr1: ArrayList<Int>, arr2: ArrayList<Int>): ArrayList<Int> {
    if (arr1.isNullOrEmpty()) return arr2
    if (arr2.isNullOrEmpty()) return arr1

    var i = 0
    var j = 0
    val result = arrayListOf<Int>()
    while (i < arr1.size && j < arr2.size) {
        if (arr1[i] <= arr2[j]) {
            result.add(arr1[i])
            i++
        } else {
            result.add(arr2[j])
            j++
        }
    }
    while (i < arr1.size) {
        result.add(arr1[i])
        i++
    }
    while (j < arr2.size) {
        result.add(arr2[j])
        j++
    }
    return result
}
