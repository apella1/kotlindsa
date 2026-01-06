package me.apella.leetcode.easy

fun main() {
    val nums: IntArray = intArrayOf(3, 4, 5, 6, 7, 3)
    println("containsDuplicateEarlyExit")
    println(containsDuplicateEarlyExit(nums))
    println("containsDuplicateMap")
    println(containsDuplicateMap(nums))
    println("containsDuplicateMapIdiomatic")
    println(containsDuplicateMapIdiomatic(nums))
    println("containsDuplicates")
    println(containsDuplicate(nums))
}

fun containsDuplicateMap(nums: IntArray): Boolean {
    val map = mutableMapOf<Int, Int>()
    for (num in nums) {
        if (map.contains(num)) {
            return true
        }
        map[num] = 1
    }
    return false
}

fun containsDuplicateEarlyExit(nums: IntArray): Boolean {
    val seen = mutableSetOf<Int>()
    for (num in nums) {
        if (!seen.add(num)) return true
    }
    return false
}

fun containsDuplicateMapIdiomatic(nums: IntArray): Boolean {
    val counts = mutableMapOf<Int, Int>()
    for (num in nums) {
        val currentCount = counts.getOrDefault(num, 0) + 1
        if (currentCount > 1) return true
        counts[num] = currentCount
    }
    return false
}

fun containsDuplicate(nums: IntArray): Boolean {
    return nums.distinct().size < nums.size
}