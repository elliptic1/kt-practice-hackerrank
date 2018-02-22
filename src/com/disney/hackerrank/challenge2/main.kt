package com.disney.hackerrank.challenge2

fun main(args: Array<String>) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val n = readLine()?.toInt()?:0
    val strings = arrayListOf<String>()
    val queries = arrayListOf<String>()
    for (i in 0 until n) {
        strings.add(readLine()?:"")
    }
    val q = readLine()?.toInt()?:0
    for (i in 0 until q) {
        queries.add(readLine()?:"")
    }
    for (q in queries) {
        var c = 0
        for (s in strings) {
            if (q.equals(s)) {
                c++
            }
        }
        println(c)
    }
}