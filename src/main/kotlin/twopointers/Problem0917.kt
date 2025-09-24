package twopointers

object Problem0917 {
  class Solution {
    fun reverseOnlyLetters(s: String): String {
      val arr = s.toCharArray()

      var l = 0
      var r = arr.lastIndex

      while(l<r) {
        while (l < r && !arr[l].isLetter()) l++
        while (l < r && !arr[r].isLetter()) r--
        val x = arr[l]
        arr[l] = arr[r]
        arr[r] = x

        l++
        r--
      }

      return String(arr)
    }
  }
}