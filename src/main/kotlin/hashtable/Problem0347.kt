package hashtable

object Problem0347 {
  class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
      val map = HashMap<Int, Int>()
      for (n in nums) {
        val nCount = map[n] ?: 0
        map[n] = nCount + 1
      }

      val buckets = Array<MutableList<Int>>(nums.size + 1) { mutableListOf() }

      for ((n, count) in map) {
        buckets[count].add(n)
      }

      val result = IntArray(k)
      var f = 0
      for (i in buckets.size - 1 downTo 0) {
        for (count in buckets[i]) {
          result[f] = count
          f++
          if (f >= k) return result
        }
      }

      return result
    }
  }
}