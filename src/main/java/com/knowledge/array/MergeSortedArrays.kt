package com.knowledge.array

fun main() {
//    val result = merge(arrayOf(1, 3, 5, 7, 9), arrayOf(2, 4, 6, 8))
    println(
        "resulting array is ${
            mergeKArrays(
                arrayOf(arrayOf(1, 3, 5, 7, 9)),
                0, 0
            ).toList()
        }"
    )
    println(
        "resulting array is ${
            mergeKArrays(
                arrayOf(arrayOf(1, 3, 5, 7, 9), arrayOf(2, 4, 6, 8)),
                0, 1
            ).toList()
        }"
    )

    println(
        "resulting array is ${
            mergeKArrays(
                arrayOf(
                    arrayOf(1, 4, 7, 10, 13),
                    arrayOf(2, 5, 8, 11, 14),
                    arrayOf(3, 6, 9, 12, 15)
                ),
                0, 2
            ).toList()
        }"
    )
}

fun mergeKArrays(arr: Array<Array<Int>>, i: Int, j: Int): Array<Int> {
    if (i - j == 0) {
        return arr[i]
    }
    if (j - i == 1) {
        return merge(arr[0], arr[1])
    }

    val out1 = mergeKArrays(arr, i, (i + j) / 2)
    val out2 = mergeKArrays(arr, (i + j) / 2 + 1, j)
    return merge(out1, out2)
}

fun merge(arr1: Array<Int>, arr2: Array<Int>): Array<Int> {
    if (arr1.isNullOrEmpty()) return arr2
    if (arr2.isNullOrEmpty()) return arr1

    var i = 0
    var j = 0
    val result = arrayListOf<Int>()
    while (i < arr1.size && j < arr2.size) {
        if (arr1[i] <= arr2[j]) {
            result.add(arr1[i++])
        } else {
            result.add(arr2[j++])
        }
    }
    while (i < arr1.size) {
        result.add(arr1[i++])
    }
    while (j < arr2.size) {
        result.add(arr2[j++])
    }
    return result.toTypedArray()
}
