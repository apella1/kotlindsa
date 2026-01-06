package me.apella.leetcode.easy

fun main() {
    val s = "tac"
    val t = "cat"

    println("Sorted Solution")
    println(sortedSolution(s, t))
}

fun sortedSolution(s: String, t: String): Boolean {
    return s.toCharArray().sorted() == t.toCharArray().sorted()
}