package com.example.codeeditor.others

class Invariant<T>(private var data: T) {
    fun set(value: T){
        data = value
    }
    fun get(): T = data
}

class Covariant<out T>(private var data: T) {
    fun get(): T = data
}

class Contravariant<in T> {
    fun set(value: T) {
        println("Processing: $value")
    }
}

fun main() {
    val invariant1: Invariant<String> = Invariant("abc")
    // Container is <T>(invariant) type, for which type should be same(even subtype are not allowed).
    //val container2: Container<Any> = container1

    // invariant allows both get(produce) and set(consume)
    println(invariant1.get())
    println(invariant1.set("def"))


    val covariant1: Covariant<String> = Covariant("abc")
    // allowed because String is subType of Any
    val covariant2: Covariant<Any> = covariant1

    // covariant is read only
    println(covariant2.get())


    val contravariant1: Contravariant<Any> = Contravariant()
    // allowed because String is subType of Any
    val contravariant2: Contravariant<String> = contravariant1

    // contravariant is write only
    println(contravariant2.set("def"))
    //println(contravariant2.set(10)) // int is not string or subtype of string.
    println(contravariant1.set(10)) // int is subtype of Any
}