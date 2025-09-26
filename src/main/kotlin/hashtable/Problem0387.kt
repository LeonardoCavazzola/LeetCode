package hashtable

object Problem0387 {
  class Solution1 {
    fun firstUniqChar(s: String): Int {
      val map = HashMap<Char, Int>()

      for (c in s) {
        map[c] = (map[c] ?: 0) + 1
      }

      for ((i, c) in s.withIndex()) {
        if (map[c]!! == 1) return i
      }


      return -1
    }
  }

  class Solution2 {
    fun firstUniqChar(s: String): Int {
      val arr = Array<Int>(26) { 0 }

      for (c in s) {
        arr[c - 'a'] = arr[c - 'a'] + 1
      }

      for ((i, c) in s.withIndex()) {
        if (arr[c - 'a'] == 1) return i
      }

      return -1
    }
  }
}