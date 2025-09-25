package twopointers

object Problem0557 {
  class Solution {
    fun reverseWords(s: String): String {
      val arr = s.toCharArray()

      var s = 0
      var f = 0

      while (f <= arr.size) {
        if (f == arr.size || arr[f] == ' ') {
          var l = s
          var r = f - 1

          while (l < r) {
            val x = arr[l]
            arr[l] = arr[r]
            arr[r] = x

            l++
            r--
          }
          s = f + 1
        }
        f++
      }

      return String(arr)
    }
  }
}