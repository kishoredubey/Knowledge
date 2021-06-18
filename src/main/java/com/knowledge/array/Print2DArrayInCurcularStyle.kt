package com.knowledge.array

/**
 * Time complexity would be O(n) because each item would be visited once
 * Space complexity - O(1)
 *
 * Caveat - this solution only works for even sized arrays like 2x2 or 3x3
 */

fun main() {
    printMeCircular(
        arrayOf(
            arrayOf(1, 2, 3, 4),
            arrayOf(1, 2, 3, 4),
            arrayOf(1, 2, 3, 4),
            arrayOf(1, 2, 3, 4),
        )
    )
}

fun printMeCircular(arr: Array<Array<Int>>) {
    var top = 0
    var bottom = 3
    var left = 0
    var right = 3
    while (top <= bottom && left <= right) {
        var i = left
        while (i <= right) {
            print(arr[top][i])
            i++
        }
        println()
        top++
        var j = top
        while (j <= bottom) {
            print(arr[j][right])
            j++
        }
        println()
        right--

        var k = right
        while (k >= left) {
            print(arr[bottom][k])
            k--
        }
        println()
        bottom--

        var l = bottom
        while (l >= top) {
            print(arr[l][left])
            l--
        }
        left++
    }
}
