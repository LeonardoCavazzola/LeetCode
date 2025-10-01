package binarytree

object Problem0112 {
  class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
  }

  // TAGs: binary tree, depth first search
  class Solution {
    fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
      if (root == null) return false

      val newTarget = targetSum - root.`val`

      return (newTarget == 0 && root.left == null && root.right == null)
          || hasPathSum(root.left, newTarget)
          || hasPathSum(root.right, newTarget)
    }
  }
}
