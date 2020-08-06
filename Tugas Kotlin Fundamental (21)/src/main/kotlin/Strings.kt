package main.kotlin

fun main(){
    val wordOne = "Modern"
    val wordTwo = "Concise"
    val wordThree = "Pragmatic"
    val wordFour = "Safe"

    val pelajaran ="""
        Kotlin is $wordOne
        Kotlin is $wordTwo
        kotlin is $wordThree
        Kotlin is $wordFour
    """.trimIndent()
    print(pelajaran)
}