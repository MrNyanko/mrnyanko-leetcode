package problem21.scala

object Solution {
    def mergeTwoLists(l1: ListNode, l2: ListNode): ListNode = {
        (l1, l2) match {
            case (null, _) => l2
            case (_, null) => l1
            case (ll1, ll2) if ll1._x < ll2._x => {
                l1.next = mergeTwoLists(l1.next, l2)
                l1
            }
            case _ => {
                l2.next = mergeTwoLists(l1, l2.next)
                l2
            }
        }
    }
}
