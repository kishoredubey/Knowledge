package com.knowledge.search

import com.knowledge.customAssertMe

fun main() {
    val LOG_MESSAGE = "Looks like the algo failed to find search key %s at right index"
    customAssertMe(
        4,
        binarySearchMe(5, arrayListOf(1, 2, 3, 4, 5, 6, 7, 8, 9))
    ) { LOG_MESSAGE.format(4) }

    customAssertMe(
        8,
        binarySearchMe(9, arrayListOf(1, 2, 3, 4, 5, 6, 7, 8, 9))
    ) { LOG_MESSAGE.format(8) }
}

fun binarySearchMe(searchKey: Int, searchList: ArrayList<Int>): Int {
    if (searchList.isNullOrEmpty()) return -1
    var start = 0;
    var end = searchList.size - 1

    while (start <= end) {
        val mid = end - start / 2
        when {
            searchList[mid] == searchKey -> {
                return mid
            }
            searchList[mid] < searchKey -> {
                start = mid + 1
            }
            else -> {
                end = mid - 1
            }
        }
    }
    return -1
}
