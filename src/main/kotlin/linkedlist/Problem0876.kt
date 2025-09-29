package linkedlist

// TAGs: linked list, two pointer
object Problem0876 {
  class ListNode(
    var `val`: Int,
    var next: ListNode? = null
  )

  class Solution {
    fun middleNode(head: ListNode?): ListNode? {
      var f = head
      var s = head

      while (f?.next != null) {
        f = f?.next?.next
        s = s?.next
      }

      return s
    }
  }
}