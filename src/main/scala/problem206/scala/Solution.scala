package problem206.scala

import scala.annotation.tailrec

/**
  * Definition for singly-linked list.
  * class ListNode(var _x: Int = 0) {
  * var next: ListNode = null
  * var x: Int = _x
  * }
  */
object Solution {
    def reverseList(head: ListNode): ListNode = {
        @tailrec
        def reverse(head: ListNode, newHead: ListNode): ListNode = {
            head match {
                case null => newHead
                case _ => {
                    val tail = head.next
                    head.next = newHead
                    reverse(tail, head)
                }
            }
        }

        reverse(head, null)
    }
}
