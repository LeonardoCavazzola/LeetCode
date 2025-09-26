package binarysearch

object Problem0035 {
  class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
      var l = 0
      var r = nums.lastIndex

      while (l <= r) {
        val i = l + (r - l) / 2
        if (nums[i] < target) {
          l = i + 1
        } else {
          r = i - 1
        }
      }

      return l
    }
  }
}