/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    private ListNode merge(ListNode left, ListNode right) {

        ListNode dummy = new ListNode();
        ListNode curr = dummy;

        while (left != null && right != null) {

            if (left.val < right.val) {

                curr.next = left;
                left = left.next;
            } else {

                curr.next = right;
                right = right.next;
            }

            curr = curr.next;
        }

        curr.next = (left != null) ? left : right;

        return dummy.next;
    }

    public ListNode sortList(ListNode head) {

        if (head == null || head.next == null) {

            return head;
        }

        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(slow);

        return merge(left, right);
    }
}