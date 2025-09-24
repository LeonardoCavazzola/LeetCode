package twopointers

object Problem27 {
  class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
      var slow = 0
      var fast = 0

      while(fast < nums.size) {
        if(nums[fast] != `val`) {
          nums[slow] = nums[fast]
          slow++
        }
        fast++
      }
      return slow
    }
  }
}