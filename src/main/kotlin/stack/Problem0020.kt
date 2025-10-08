package stack

object Problem0020 {
  class Solution {
    fun isValid(s: String): Boolean {
      if (s.length % 2 != 0) return false

      val stack = ArrayDeque<Char>(s.length)

      for (c in s) {
        when (c) {
          '(', '{', '[' -> stack.addLast(c)
          ')' -> if (stack.isEmpty() || stack.removeLast() != '(') return false
          '}' -> if (stack.isEmpty() || stack.removeLast() != '{') return false
          ']' -> if (stack.isEmpty() || stack.removeLast() != '[') return false
        }
      }

      return if (stack.size > 0) false else true
    }
  }
}