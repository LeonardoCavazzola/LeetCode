package hashtable

object Problem0001 {
  class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
      val map = HashMap<Int, Int>()

      for ((i, n) in nums.withIndex()) {
        val j = map[target - n]
        if (j != null) return intArrayOf(i, j)
        map[n] = i
      }

      return intArrayOf()
    }
  }
}
