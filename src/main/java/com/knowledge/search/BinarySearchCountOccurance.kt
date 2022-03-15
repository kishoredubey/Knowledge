package com.knowledge.search

fun main() {
    val arr = intArrayOf(1, 1, 1, 1, 5, 6, 7, 8, 9)
    val first = firstCountOccurrence(arr, 1)
    val last = lastCountOccurrence(arr, 1)
    println("answer is = ${last-first+1}")
}

fun lastCountOccurrence(arr: IntArray, key: Int): Int {
    if (arr.isEmpty()) return -1
    var start = 0;
    var end = arr.size - 1
    var out = -1;
    while (start <= end) {
        val mid = (start + end) / 2
        if (arr[mid] == key) {
            out = mid
            start = mid+1
        } else if (arr[mid] > key) {
            end = mid - 1
        } else {
            start = mid + 1
        }
    }
    return out
}

fun firstCountOccurrence(arr: IntArray, key: Int): Int {
    if (arr.isEmpty()) return -1
    var start = 0;
    var end = arr.size - 1
    var out = -1;
    while (start <= end) {
        val mid = (start + end) / 2
        if (arr[mid] == key) {
            out = mid
            end = mid - 1
        } else if (arr[mid] > key) {
            end = mid - 1
        } else {
            start = mid + 1
        }
    }
    return out
}
