package me.apella.leetcode.medium

fun main() {
    val strs = arrayOf("eat", "tea", "tan", "ate", "nat", "bat")
    println(groupAnagrams(strs))
}

fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val res = mutableListOf<List<String>>()
    strs.groupBy {
        sortString(it)
    }.forEach { sortedKey, values ->
        res.add(values)
    }
    return res
}

fun sortString(str: String): String {
    return str.toCharArray().sorted().joinToString("")
}