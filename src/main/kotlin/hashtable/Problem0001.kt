package hashtable

object Problem0001 {
  class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
      val map = hashMapOf<Int, Int>()

      nums.forEachIndexed { index, value ->
        val result = target - value
        val anotherIndex = map[result]

        if (anotherIndex != null) {
          return intArrayOf(index, anotherIndex)
        }

        map[value] = index
      }

      throw RuntimeException()
    }
  }
}
