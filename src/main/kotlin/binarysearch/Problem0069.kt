package binarysearch

object Problem0069 {
  class Solution {
    fun mySqrt(x: Int): Int {
      if (x < 2) return x

      val xl = x.toLong()
      var l = 1.toLong()
      var r = xl / 2

      while (l <= r) {
        val i = (l + (r - l) / 2)
        val sqr = i * i
        when {
          sqr == x.toLong() -> return i.toInt()
          sqr < x -> l = i + 1
          else -> r = i - 1
        }
      }

      return r.toInt()
    }
  }
}