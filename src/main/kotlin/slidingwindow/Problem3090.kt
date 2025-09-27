package slidingwindow

object Problem3090 {
  class Solution {
    fun maximumLengthSubstring(s: String): Int {
      var l = 0
      var r = 0
      val map = hashMapOf<Char, Int>()
      var max = 0

      while (r < s.length) {
        val rc = s[r]
        val lc = s[l]

        val rcCount = map[rc] ?: 0
        if (rcCount < 2) {
          map[rc] = rcCount + 1
          r++
        } else {
          map[lc] = map[lc]!! - 1
          l++
        }
        max = maxOf(max, r - l)
      }

      return max
    }
  }
}