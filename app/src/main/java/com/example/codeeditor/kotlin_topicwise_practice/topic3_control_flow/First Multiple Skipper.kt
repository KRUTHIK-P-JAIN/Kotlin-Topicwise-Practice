package com.example.codeeditor.kotlin_topicwise_practice.topic3_control_flow

//Loops and looping controls
/**
 * Problem: First Multiple Skipper
 *
 * Write a program that takes an integer `n` and prints all numbers from 1 to `n`,
 * **skipping** the first number divisible by 7, and **stopping** completely if a number divisible by both 5 and 3 is found.
 * Use For/While/Do-While loops
 *
 * Input:
 * A single integer n (1 ≤ n ≤ 1000)
 *
 * Input:
 * 20
 *
 * Output:
 * 1 2 3 4 5 6 8 9 10 11 12 13 14 15
 *
 * Explanation:
 * - 7 is skipped (first number divisible by 7)
 * - Loop stops at 15 (divisible by 5 and 3)
 *
 * Sample Test Case
 * Input:
 * 10
 *
 * Output:
 * 1 2 3 4 5 6 8 9 10
 *
 * Explanation:
 * - 7 skipped
 * - No number divisible by both 3 and 5, so loop continues till 10
 *
 */

fun main() {
    println("Enter the n")
    val n = readlnOrNull()?.toIntOrNull()

    if (n != null){
        firstMultipleSkipper(n)
        firstMultipleSkipper1(n)
    }
    else println("Invalid Input")
}

// using do-while
fun firstMultipleSkipper1(n: Int) {
    var i = 0
    var isSkipped = false
    do {
        i++
        if (i % 7 == 0 && !isSkipped) {
            isSkipped = true
            continue
        }
        if (i % 3 == 0 && i % 5 == 0) break

        print("$i ")
    } while (i <= n)
    println("- do-while")
}

// using for
fun firstMultipleSkipper(n: Int) {
    var isSkipped = false
    for (i in 1..n) {

        if (i % 7 == 0 && !isSkipped) {
            isSkipped = true
            continue
        }
        if (i % 3 == 0 && i % 5 == 0) break

        print("$i ")
    }
    println("- for")
}
