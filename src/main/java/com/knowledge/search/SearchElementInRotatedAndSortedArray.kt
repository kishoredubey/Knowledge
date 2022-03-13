package com.knowledge.search

import com.knowledge.customAssertMe

/**
 * Time complexity is O(log n) where N is the size of the array
 * space complexity is O(0) - because no extra space is required
 */
fun main() {
    val LOG_MESSAGE = "Looks like the algo failed to find search key %s at right index"
    customAssertMe(
        8,
        searchMe(3, arrayListOf(5, 6, 7, 8, 9, 10, 1, 2, 3))
    ) { LOG_MESSAGE.format(3) }

    customAssertMe(
        -1,
        searchMe(232, arrayListOf(5, 6, 7, 8, 9, 10, 1, 2, 3))
    ) { LOG_MESSAGE.format(232) }

    customAssertMe(
        3,
        searchMe(10, arrayListOf(30, 40, 50, 10, 20))
    ) { LOG_MESSAGE.format(10) }
}

fun searchMe(searchKey: Int, searchList: ArrayList<Int>): Int {
    return rotated(searchKey, searchList, 0, searchList.size - 1)
}

fun rotated(searchKey: Int, searchList: ArrayList<Int>, left: Int, right: Int): Int {
    if (left > right) return -1

    val mid = left + right / 2
    if (searchList[mid] == searchKey) return mid

    return if (searchList[mid] >= searchList[left]) {
        if (searchKey >= searchList[left] && searchKey <= searchList[mid]) {
            rotated(searchKey, searchList, left, mid - 1)
        } else {
            rotated(searchKey, searchList, mid + 1, right)
        }
    } else {
        if (searchKey >= searchList[mid] && searchKey <= searchList[right]) {
            rotated(searchKey, searchList, mid + 1, right)
        } else {
            rotated(searchKey, searchList, left, mid - 1)
        }
    }
}
