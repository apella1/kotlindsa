package me.apella.leetcode.medium

fun main() {
    val nums: IntArray = intArrayOf(100, 4, 200, 1, 3, 2)
    val otherNums = intArrayOf(9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6)
    println(otherNums.sorted())
    println(longestConsecutiveSequence(nums))
    // failing test case
    println(longestConsecutiveSequence(otherNums))
}

/* solve in O(n) */
/* sorting time is O(log(n)) */
fun longestConsecutiveSequence(nums: IntArray): Int {
    val arrSet = nums.toSet()
    var longestSequence = 0

    for (num in nums) {
        var length = 0
        // check if num is the start of a sequence
        if (!arrSet.contains(num - 1)) {
            while (arrSet.contains(num + length)) {
                length++
            }
            longestSequence = kotlin.math.max(length, longestSequence)
        }
    }
    return longestSequence
}