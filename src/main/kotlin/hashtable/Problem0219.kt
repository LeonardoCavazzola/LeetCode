package hashtable

// TAGs: sliding window, hash table
object Problem0219 {
  class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
      val set = HashSet<Int>()

      for(i in nums.indices) {
        if(i>k) {
          val outing = nums[i - k -1]
          set.remove(outing)
        }

        val n = nums[i]

        if(set.contains(n)) {
          return true
        }
        set.add(n)
      }
      return false
    }
  }
}