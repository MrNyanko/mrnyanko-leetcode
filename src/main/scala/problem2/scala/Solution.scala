package problem2.scala

object Solution {
    def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = {

        val pre = new ListNode(-1)
        var head = new ListNode(0)
        pre.next = head
        var carry = 0

        def loop(l1: ListNode, l2: ListNode): ListNode = {
            var tmp = carry

            (l1, l2) match {
                case (null, null) => head
                case (n1, null) => {
                    tmp = tmp + n1.x
                    carry = if (tmp >= 10) {
                        tmp = tmp % 10
                        1
                    } else {
                        0
                    }
                    head.next = new ListNode(tmp)
                    head = head.next
                    loop(n1.next, null)
                }
                case (null, n2) => {
                    tmp = tmp + n2.x
                    carry = if (tmp >= 10) {
                        tmp = tmp % 10
                        1
                    } else {
                        0
                    }
                    head.next = new ListNode(tmp)
                    head = head.next
                    loop(n2.next, null)
                }
                case (n1, n2) => {
                    tmp = tmp + n1.x + n2.x
                    carry = if (tmp >= 10) {
                        tmp = tmp % 10
                        1
                    } else {
                        0
                    }
                    head.next = new ListNode(tmp)
                    head = head.next
                    loop(n1.next, n2.next)
                }
                case _ => head
            }
        }

        loop(l1, l2)

        if (carry != 0)
            head.next = new ListNode(carry)

        pre.next.next
    }
}
