package twopointers

object Problem0344 {
  class Solution {
    fun reverseString(s: CharArray): Unit {
      var l = 0
      var r = s.lastIndex

      while (l < r) {
        val x = s[l]
        s[l] = s[r]
        s[r] = x

        l++
        r--
      }
    }
  }
}