package binarytree

object Problem0094 {
  class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
  }

  // TAGs: binary tree
  class Solution {
    fun inorderTraversal(root: TreeNode?): List<Int> {
      val list = mutableListOf<Int>()

      if (root == null) return list

      list.addAll(inorderTraversal(root.left))
      list.add(root.`val`)
      list.addAll(inorderTraversal(root.right))

      return list
    }
  }
}