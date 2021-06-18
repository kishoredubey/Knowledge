package com.knowledge

fun <T> customAssertMe(expected: T, actual: T, logMessage: () -> String) {
    if (expected != actual) {
        println("    !!! ${logMessage()} !!!    ")
    }
}