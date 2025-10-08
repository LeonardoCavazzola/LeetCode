package binarytree

object Problem0102 {
  class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
  }

  class Solution {
    fun levelOrder(root: TreeNode?): List<List<Int>> {
      val res = mutableListOf<List<Int>>()
      val q = ArrayDeque<TreeNode?>()

      q.add(root)

      while (q.size > 0) {
        val level = mutableListOf<Int>()

        repeat(q.size) {
          val node = q.removeFirst()
          node?.`val`?.let(level::add)

          if (node?.left != null) q.add(node.left)
          if (node?.right != null) q.add(node.right)
        }

        if (level.size > 0) res.add(level)
      }

      return res
    }
  }
}
