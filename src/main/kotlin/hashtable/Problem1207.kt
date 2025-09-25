package hashtable

fun main() {
  Problem1207.Solution().uniqueOccurrences(intArrayOf(1,1,1))
}

object Problem1207 {
  class Solution {
    fun uniqueOccurrences(arr: IntArray): Boolean {
      val map = hashMapOf<Int, Int>()

      for (n in arr) {
        map[n] = (map[n] ?: 0) + 1
      }

      val set = HashSet<Int>()
      for (count in map.values) {
        if (!set.add(count)) return false
      }
      return true
    }
  }
}