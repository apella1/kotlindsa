package me.apella.leetcode.easy

fun main() {
    val nums: IntArray = intArrayOf(2, 7, 11, 15)
    val target = 9
    println("Hash map solution")
    println(twoSumHashMap(nums, target).toList())
    println()
    println("Nested Loops solution")
    println(twoSumNestedLoops(nums, target).toList())
}

fun twoSumHashMap(nums: IntArray, target: Int): IntArray {
    val res = intArrayOf(0, 0)
    val dictStore = mutableMapOf<Int, Int>()
    for ((index, value) in nums.withIndex()) {
        val diff = target - value
        if (dictStore.containsValue(diff)) {
            res[0] = index
            res[1] = dictStore.keys.first { key -> dictStore[key] == diff }
            return res
        }
        dictStore[index] = value
    }

    return res
}

fun twoSumNestedLoops(nums: IntArray, target: Int): IntArray {
    val res = intArrayOf(0, 0)

    for (i in nums.indices) {
        for (j in 1..<nums.size) {
            if (nums[i] + nums[j] == target) {
                res[0] = i
                res[1] = j
            }
        }
    }
    return res
}
