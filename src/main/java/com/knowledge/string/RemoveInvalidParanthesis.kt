package com.knowledge.string

fun main() {
    var expression = "()())()"
    removeInvalidParenthesis(expression)
    println()
    expression = "()v)"
    removeInvalidParenthesis(expression)
}

fun removeInvalidParenthesis(str: String) {
    if (str.isNullOrEmpty()) return
    var i = 0
    val visited = HashSet<String>()
    while (i < str.length) {
        if (isParenthesis(str.toCharArray()[i])) {
            val newStr = str.substring(0, i) + str.substring(i + 1)
            if (isValidString(newStr) && !visited.contains(newStr)) {
                visited.add(newStr)
                println(newStr)
            }
        }
        i++
    }
}

fun isParenthesis(str: Char): Boolean {
    return str == '(' || str == ')'
}

fun isValidString(str: String): Boolean {
    var i = 0
    var count = 0
    val charArr = str.toCharArray()
    while (i < str.length) {
        if (charArr[i] == '(') {
            count++
        }
        if (charArr[i] == ')') {
            count--
            if (count < 0) break
        }
        i++
    }
    return count == 0
}