package linkedlist

object Problem0206 {
  class ListNode(var `val`: Int) {
    var next: ListNode? = null
  }

  class Solution {
    fun reverseList(head: ListNode?): ListNode? {
      var current = head
      var curAnt: ListNode? = null

      while(current != null) {
        val curNext = current.next
        current.next = curAnt
        curAnt = current
        current = curNext
      }

      return curAnt
    }
  }
}