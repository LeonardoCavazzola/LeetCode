package stack

object Problem0155 {
  class MinStack {
    private val stack = IntArray(9000)
    private val minStack = IntArray(9000)
    private var top = -1

    fun push(`val`: Int) {
      top++
      stack[top] = `val`
      if (top == 0) {
        minStack[top] = `val`
      } else {
        minStack[top] = minOf(`val`, minStack[top - 1])
      }
    }

    fun pop() {
      if (top >= 0) top--
    }

    fun top(): Int {
      return stack[top]
    }

    fun getMin(): Int {
      return minStack[top]
    }
  }
}
