package twopointers

object Problem0011 {
  class Solution {
    fun maxArea(height: IntArray): Int {
      var l = 0
      var r = height.lastIndex
      var better = -1

      while(l<r) {
        val minH = minOf(height[l], height[r])
        val width = r-l
        val vl = minH * width

        better = maxOf(better, vl)
        if(height[l] < height[r]) {
          l++
        } else{
          r--
        }
      }
      return better
    }
  }
}