package prefixsum

object Problem1732 {
  class Solution {
    fun largestAltitude(gain: IntArray): Int {
      var current = 0
      var hst = 0

      for (it in gain) {
        current += it
        hst = maxOf(hst, current)
      }

      return hst
    }
  }
}