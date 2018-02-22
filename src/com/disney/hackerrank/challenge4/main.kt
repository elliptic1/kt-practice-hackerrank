package com.disney.hackerrank.challenge4

import java.io.*
import java.util.*

fun main(args: Array<String>) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val (list_size, nops) = (readLine()?:"").split(" ").map{ it.toLong() }
    val list = mutableListOf<Long>()
    (0 until list_size).map { 0L }.mapTo(list) { it }
    for (i in 0 until nops) {
        val (op1, op2, op3) = (readLine()?:"").split(" ").map { it.toLong() }
        for (j in op1 until op2+1) {
            list[(j-1).toInt()] += op3
        }
    }
    println(list.max())
}