package Problem2.scala

class ListNode(var _x: Int = 0) {

    var next: ListNode = null
    var x: Int = _x

    override def toString: String = {


        def toS(listNode: ListNode): String = {
            if (listNode != null) {
                listNode.x + "->" + toS(listNode.next)
            } else {
                ""
            }
        }

        toS(this)
    }

}

object ListNode {
    def apply(nums: Int*): ListNode = {
        if (nums.isEmpty) null else {
            nums.map(new ListNode(_)).reduceRight((node, res) => {
                node.next = res
                node
            })
        }
    }
}
