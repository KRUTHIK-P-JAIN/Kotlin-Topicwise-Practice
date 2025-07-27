package com.example.codeeditor.kotlin_topicwise_practice.topic1_variables_and_types

/**
 * Problem Statement:
 * You are developing a profile summary system. Your task is to store user details like first name,
 * last name, age, and whether the user is a student. Then, print a formatted message showing the
 * full name, age, and student status using Kotlin string templates.
 *
 * Input:
 * firstName = "Ravi"
 * lastName = "Kumar"
 * age = 24
 * isStudent = true
 *
 * Output:
 * Ravi Kumar is 24 years old.
 * Student Status: true
 */

fun main() {
    val firstName = "Ravi"
    val lastName = "Kumar"
    val age = 24
    val isStudent = true

    val message = "$firstName $lastName is $age years old. \nStudent Status: $isStudent"
    print(message)
}