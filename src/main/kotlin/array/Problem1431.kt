package array

object Problem1431 {
  class Solution {
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
      var h = 0
      for (it in candies) {
        h = maxOf(h, it)
      }

      val result = mutableListOf<Boolean>()
      for (it in candies) {
        result.add(it + extraCandies >= h)
      }
      return result
    }
  }
}