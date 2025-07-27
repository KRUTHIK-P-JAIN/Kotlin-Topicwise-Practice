package com.example.codeeditor.kotlin_topicwise_practice.topic2_operators_and_expressions

/**
 * Problem: Smart Locker
 *
 * A smart locker system accepts a 6-digit PIN code from users. The system considers a PIN valid if:
 *
 * - The sum of its digits is greater than 20
 * - It contains at least two even digits
 * - The digits are not in strictly ascending order
 *
 * You are to implement a function that validates a PIN based on the above rules.
 *
 * Input:
 * A single line containing a 6-digit number as a string. (You can assume the string is always 6 characters and only positive digits.)
 *
 * Input:
 * "682319"
 *
 * Output:
 * Print "Valid" if the PIN satisfies all conditions, otherwise print "Invalid".
 *
 * Output:
 * Valid
 *
 * Explanation:
 * Sum = 6+8+2+3+1+9 = 29 → ✅
 * Even digits = 6, 8, 2 → ✅ (3 even digits)
 * Not in ascending order (e.g., 2 < 3 < 1 fails) → ✅
 * So, the PIN is valid.
 *
 * Sample Test Cases
 * Input:
 * "123456"
 * Output:
 * Invalid
 *
 * Input:
 * "840162"
 * Output:
 * Valid
 *
 */

fun main() {
    println("Enter a 6 digit pin")
    val pin = readlnOrNull()

    if (!pin.isNullOrBlank()) {
        val validity = smartLocker(pin)
        println(validity)
    }
    else {
        println("Invalid")
    }
}

fun smartLocker(pin: String): String {
    var sum = 0
    var evenCount = 0
    var isStrictlyAscending = true
    var prevDigit = -1

    for (i in pin.indices) {
        val digit = pin[i].digitToIntOrNull()
        if (digit != null) {
            sum += digit

            if (digit % 2 == 0) evenCount += 1

            if (i > 0 && prevDigit >= digit) isStrictlyAscending = false
            prevDigit = digit
        }
    }

    val isValid = sum > 20 && evenCount > 2 && !isStrictlyAscending
    return if (isValid)
        "Valid"
    else
        "Invalid"
}
