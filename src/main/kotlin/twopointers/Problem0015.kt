package twopointers

object Problem0015 {
  class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
      nums.sort()
      val list = mutableListOf<List<Int>>()

      for ((i, n) in nums.withIndex()) {
        if (i > 0 && n == nums[i - 1]) continue

        var l = i + 1
        var r = nums.lastIndex

        while (l < r) {
          val sum = n + nums[l] + nums[r]
          when {
            sum < 0 -> l++
            sum > 0 -> r--
            else -> {
              list.add(listOf(n, nums[l], nums[r]))

              do l++ while (l < r && nums[l] == nums[l - 1])
              do r-- while (l < r && nums[l] == nums[r + 1])
            }
          }
        }
      }

      return list
    }
  }
}