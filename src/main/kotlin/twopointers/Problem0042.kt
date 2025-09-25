package twopointers

// TODO revisar pra fixar
object Problem0042 {
  class Solution {
    fun trap(height: IntArray): Int {
      var l = 0
      var r = height.lastIndex
      var lMax = 0
      var rMax = 0
      var trapped = 0

      while (l < r) {
        if (height[l] < height[r]) {
          if (height[l] >= lMax) {
            lMax = height[l]
          } else {
            trapped += lMax - height[l]
          }
          l++
        } else {
          if (height[r] >= rMax) {
            rMax = height[r]
          } else {
            trapped += rMax - height[r]
          }
          r--
        }
      }

      return trapped
    }
  }
}