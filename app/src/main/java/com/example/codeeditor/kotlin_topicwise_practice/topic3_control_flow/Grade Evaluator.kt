package com.example.codeeditor.kotlin_topicwise_practice.topic3_control_flow

/**
 * Problem: Grade Evaluator
 *
 * A school assigns grades based on the following scoring system:
 * - 90 to 100 → Grade A
 * - 75 to 89 → Grade B
 * - 60 to 74 → Grade C
 * - 40 to 59 → Grade D
 * - Below 40 → Grade F
 *
 * You need to implement a function that evaluates and prints the grade based on a given score.
 * Use if else or when statements only.
 *
 * Input:
 * A single integer score (0 ≤ score ≤ 100)
 *
 * Input:
 * 85
 *
 * Output:
 * Print the corresponding grade based on the rules.
 *
 * Output:
 * Grade B
 *
 * Explanation:
 * The score 85 falls in the range 75 to 89, so the grade is B.
 *
 * Sample Test Cases
 * Input:
 * 39
 *
 * Output:
 * Grade F
 *
 * Input:
 * 92
 *
 * Output:
 * Grade A
 *
 */

fun main() {
    println("Enter the score")
    val score = readlnOrNull()?.toIntOrNull()

    if (score != null){
        val grade = gradeEvaluator(score)

        println(grade)
    }
    else{
        println("Invalid input")
    }
}

fun gradeEvaluator(score: Int): String {
    return when(score) {
        in 90..100 -> "Grade A"
        in 75..89 -> "Grade B"
        in 60..74 -> "Grade C"
        in 40..59 -> "Grade D"
        else -> "Grade F"
    }
}
