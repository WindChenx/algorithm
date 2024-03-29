package 力扣.List_node;


/**
 *将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 *
 *示例：
 *
 *输入：1->2->4, 1->3->4
 *输出：1->1->2->3->4->4
 */

class MergeTwoLists_21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
			return null;
		}

		if (l1 == null) {
			return l2;
		}

		if (l2 == null) {
			return l1;
		}

		ListNode p = new ListNode(0);
		ListNode head = p;

		while (l1 != null && l2 != null) {

			if (l1.val < l2.val) {
				p.next = l1;
				l1 = l1.next;
			} else {
				p.next = l2;
				l2 = l2.next;
			}

			p = p.next;
		}

		if (l1 != null) {
			p.next = l1;
		} else {
			p.next = l2;
		}

		return head.next;
    }
}
