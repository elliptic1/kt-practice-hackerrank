package com.disney.hackerrank.challenge3

import java.io.*
import java.util.*

fun main(args: Array<String>) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    readLine()
    val ints = readLine()?.split(" ") ?: listOf()
    print(ints.reversed().joinToString(" "))
}