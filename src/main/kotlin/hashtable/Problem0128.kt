package hashtable

object Problem0128 {
  class Solution {
    fun longestConsecutive(nums: IntArray): Int {
      if (nums.isEmpty()) return 0
      val set = nums.toHashSet()
      var lgst = 0

      for (n in set) {
        var currentSeqSize = 1
        var currentNumber = n

        if (set.contains(currentNumber - 1)) continue
        while (set.contains(currentNumber + 1)) {
          currentSeqSize++
          currentNumber++
        }
        lgst = maxOf(currentSeqSize, lgst)
      }
      return lgst
    }
  }
}