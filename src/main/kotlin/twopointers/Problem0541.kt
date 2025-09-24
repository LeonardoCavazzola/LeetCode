package twopointers

object Problem0541 {
  class Solution {
    fun reverseStr(s: String, k: Int): String {
      val a = s.toCharArray()
      val n = a.size

      var i = 0
      while (i < n) {
        var left = i
        var right = minOf(i + k - 1, n - 1)

        while (left < right) {
          val tmp = a[left]
          a[left] = a[right]
          a[right] = tmp
          left++
          right--
        }
        i += 2 * k
      }

      return String(a)
    }
  }
}