package hashtable

object Problem0454 {
  class Solution {
    fun fourSumCount(nums1: IntArray, nums2: IntArray, nums3: IntArray, nums4: IntArray): Int {
      val map = HashMap<Int, Int>()
      var count = 0
      for(n1 in nums1) {
        for(n2 in nums2) {
          val sum = n1 + n2
          map[sum] = (map[sum] ?: 0) + 1
        }
      }

      for(n3 in nums3) {
        for(n4 in nums4) {
          val dif = 0 - n3 - n4
          count += map[dif] ?: 0
        }
      }

      return count
    }
  }
}