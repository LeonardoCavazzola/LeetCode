package twopointers

object Problem167 {
  class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
      var l = 0
      var r = numbers.lastIndex

      while (l < r) {
        val sum = numbers[l] + numbers[r]
        when {
          sum == target -> return intArrayOf(l + 1, r + 1)
          sum > target -> r--
          else -> l++
        }
      }

      throw RuntimeException()
    }
  }
}