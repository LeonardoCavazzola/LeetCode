package linkedlist

// TAGs: linked list
object Problem0021 {
  class ListNode(var `val`: Int) {
    var next: ListNode? = null
  }

  class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
      var l1 = list1
      var l2 = list2
      val head: ListNode? = ListNode(0)
      var tail: ListNode? = head

      while (l1 != null && l2 != null) {
        if (l1.`val` < l2.`val`) {
          tail?.next = l1
          tail = l1
          l1 = l1.next
        } else {
          tail?.next = l2
          tail = l2
          l2 = l2.next
        }
      }

      tail?.next = if (l1 == null) l2 else l1

      return head?.next
    }
  }
}