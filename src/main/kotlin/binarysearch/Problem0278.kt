package binarysearch

object Problem0278 {
  // This mock is needed to compile the code
  abstract class VersionControl {
    abstract fun firstBadVersion(n: Int): Int
    fun isBadVersion(version: Int): Boolean = true
  }

  class Solution : VersionControl() {
    override fun firstBadVersion(n: Int): Int {
      var l = 1
      var r = n

      while (l <= r) {
        val i = ((r - l) / 2) + l

        if (isBadVersion(i)) {
          r = i - 1
        } else {
          l = i + 1
        }
      }

      return l
    }
  }
}