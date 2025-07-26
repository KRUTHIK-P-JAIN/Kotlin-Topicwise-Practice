package com.example.codeeditor.others.exercism

fun main(){
    val phrase = "Complementary metal-oxide semiconductor"
    var acronym = ""
    val phraseSeparatedBySpace = phrase.split(" ")
    val phraseSeparatedByHyphen = phraseSeparatedBySpace.flatMap {
        it.split("-")
    }

    phraseSeparatedByHyphen.map { str ->
        val char = str.firstOrNull { it.isLetter() }
        char?.let {
            acronym += it
        }
    }

    print(acronym.uppercase())

    //other solution
    /*
    phrase.split(" ","-","_")
        .filter {it.isNotBlank()}
        .map { it[0] }.map { it.uppercaseChar() }.joinToString ("")
     */
}