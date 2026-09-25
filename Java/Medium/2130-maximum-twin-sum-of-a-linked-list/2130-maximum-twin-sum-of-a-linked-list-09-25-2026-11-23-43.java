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
    public int pairSum(ListNode head) {

       ListNode slow = head;
       ListNode fast = head;

       while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
       }

        ListNode pre = null;
        ListNode curr = slow;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }

        int max = Integer.MIN_VALUE;
        ListNode p = head;
        ListNode q = pre;

        while(q != null){
            int sum = p.val + q.val;
            max = Math.max(sum, max);
            p = p.next;
            q = q.next; 
        }
            return max;
    }
}