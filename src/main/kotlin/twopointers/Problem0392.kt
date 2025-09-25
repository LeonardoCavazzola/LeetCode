package twopointers

object Problem0392 {
  class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
      if (s.length == 0) return true

      var i = 0;
      var j = 0;

      while (j < t.length) {
        if (s[i] == t[j]) {
          i++
          j++
          if (i >= s.length) return true
        } else {
          j++
        }
      }

      return false
    }
  }
}