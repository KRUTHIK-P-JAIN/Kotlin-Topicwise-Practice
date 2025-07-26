package com.example.codeeditor.others.exercism

import kotlin.collections.ArrayDeque

// TODO: implement proper exceptions to complete the task
class EmptyBufferException

class BufferFullException(message: String): RuntimeException(message)

class CircularBuffer<T> {
    private val buffer: ArrayDeque<T> = ArrayDeque(7)

    fun read() : T {
        TODO("Implement this function to complete the task")
    }

    fun write(value: T) {
        if (buffer.size == 7){
            throw BufferFullException("writes are blocked until a slot becomes free.")
            return
        }
        buffer.add(value)
        printBuffer()
    }

    fun overwrite(value: T) {
        TODO("Implement this function to complete the task")
    }

    fun clear() {
        buffer.removeFirst()
        printBuffer()
    }

    private fun printBuffer() {
        println(buffer)
    }
}

fun main(){
    CircularBuffer<Int>().apply {
        write(1)
        write(2)
        write(1)
        write(2)
        clear()
    }
}