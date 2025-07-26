package com.example.codeeditor.others.exercism

import kotlin.math.pow

fun main(){
    val input = 153
    val inputString = input.toString()
    val length = inputString.length
    var sum = 0
    input.toString().forEach { c ->
        sum += Math.pow(c.digitToInt().toDouble(), length.toDouble()).toInt()
    }
    print("$sum $input ${sum == input}")

    //other solution
    /*
    val digits = number.toString().map { it.digitToInt() } // Extract digits
    val power = digits.size                                // Number of digits
    val sum = digits.sumOf { it.toDouble().pow(power).toInt() } // Sum of powers
    print(sum == number)
     */

    /*
    input.toString().map { c ->
        c.digitToInt().toDouble().pow(input.toString().length).toInt()
    }.sum() == input
     */
}