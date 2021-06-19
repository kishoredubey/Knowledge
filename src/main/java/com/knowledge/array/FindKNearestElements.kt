package com.knowledge.array

fun main() {
    println(
        "elements are ${
            findKElements(
                arrayOf(12, 16, 22, 30, 35, 39, 42, 45, 48, 50, 53, 55, 56),
                35,
                4
            ).toList()
        }"
    )
}

fun findKElements(arr: Array<Int>, key: Int, k: Int): List<Int> {
    var out = mutableListOf<Int>()
    var l = findCrossover(arr, 0, arr.size, key)
    var r = l + 1
    if (arr[l] == key) l--
    var count = 0
    while (l >= 0 && r < arr.size && count < k) {
        if (key - arr[l] < arr[r] - key) {
            out.add(arr[l--])
        } else {
            out.add(arr[r++])
        }
        count++
    }
    while (count < k && l >= 0) {
        out.add(arr[l--])
        count++
    }
    while (count < k && r <= arr.size) {
        out.add(arr[r++])
        count++
    }
    return out
}

fun findCrossover(arr: Array<Int>, low: Int, high: Int, key: Int): Int {
    val mid = (low + high) / 2

    if (arr[mid] <= key && arr[mid + 1] > key) {
        return mid
    }
    return if (arr[mid] < key) {
        findCrossover(arr, mid + 1, high, key)
    } else {
        findCrossover(arr, low, mid - 1, key)
    }
}


