package com.disney.hackerrank.challenge1

fun main(args: Array<String>) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
    val a = readLine()?.split(" ")
    val b = readLine()?.split(" ")

    val newints = mutableListOf<Int>()
    if (a != null && a.size == 2) {
        val size = a[0]
        val shifts = a.get(1).toInt()
        (0 until a[0].toInt())
                .map { b?.get((it +shifts) % size.toInt())?.toInt() }
                .mapTo(newints) { it ?: 0 }
    }

    print (newints.joinToString(" ", "", "", -1, "", null))
}


