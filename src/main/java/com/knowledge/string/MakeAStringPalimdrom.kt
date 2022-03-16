package com.knowledge.string

/**
Given a com.knowledge.string, we need to check whether it is possible to make this com.knowledge.string a palindrome after removing exactly one character from this.
Examples:
Input  : str = “abcba”
Output : Yes
we can remove character ‘c’ to make com.knowledge.string palindrome

Input  : str = “abcbea”
Output : Yes
we can remove character ‘e’ to make com.knowledge.string palindrome

Input : str = “abecbea”
It is not possible to make this com.knowledge.string palindrome
just by removing one character
 */

fun main() {
    println("${makeItPalindrome("abcbea")}")
    println("${makeItPalindrome("abecbea")}")
    println("${makeItPalindrome("abcba")}")
    println("${makeItPalindrome("1407741")}")
}

fun makeItPalindrome(s: String): Int {
    var low = 0
    var high = s.length - 1

    val charArr = s.toCharArray()
    while (low < high) {
        if (charArr[low] == charArr[high]) {
            low++
            high--
        } else {
            if (isPalindrome(s, low + 1, high)) {
                return low
            }
            if (isPalindrome(s, low, high - 1)) {
                return high
            }
            return -1
        }
    }
    return -2
}

fun isPalindrome(str: String, l: Int, h: Int): Boolean {
    val charArr = str.toCharArray()
    var low = l
    var high = h
    while (low <= high) {
        if (charArr[low] != charArr[high]) {
            return false
        }
        low++
        high--
    }
    return true
}