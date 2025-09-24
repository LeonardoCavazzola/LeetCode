package twopointers

object Problem28 {
  class Solution {
    fun strStr(haystack: String, needle: String): Int {
      var i = 0
      var j = 0

      while (i < haystack.length) {
        if (haystack[i] == needle[j]) {
          i++
          j++
          if (j == needle.length) {
            return i - needle.length
          }
        } else {
          i = i - j + 1
          j = 0
        }
      }
      return -1
    }
  }
}