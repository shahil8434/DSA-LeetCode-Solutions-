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

    ListNode middle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                temp.next = list1;
                temp = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                temp = list2;
                list2 = list2.next;
            }
        }
        while (list1 != null) {
            temp.next = list1;
            temp = list1;
            list1 = list1.next;
        }

        while (list2 != null) {
            temp.next = list2;
            temp = list2;
            list2 = list2.next;
        }
        return dummy.next;
    }

    ListNode divide(ListNode head){
        if(head == null || head.next == null){
            return head;
        }

        ListNode mid = middle(head);
        ListNode right = mid.next;
        mid.next = null;
        ListNode left = head;
        
        left = divide(left);
        right = divide(right);
        return merge(left, right);

}

    public ListNode insertionSortList(ListNode head) {
       return divide(head);
    }
}