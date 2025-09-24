package twopointers

object Problem0015 {
  class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
      nums.sort()
      val list = mutableListOf<List<Int>>()

      for ((i, v) in nums.withIndex()) {
        if (i > 0 && v == nums[i - 1]) continue

        var l = i + 1
        var r = nums.lastIndex

        while (l < r) {
          val sum = v + nums[l] + nums[r]
          when {
            sum == 0 -> {
              list.add(listOf(v, nums[l], nums[r]))
              l++
              while (nums[l] == nums[l - 1] && l < r) {
                l++
              }
            }

            sum > 0 -> r--
            else -> l++
          }
        }
      }

      return list
    }
  }
}