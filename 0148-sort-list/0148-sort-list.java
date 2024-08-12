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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode middle = getmiddle(head);
        ListNode second = middle.next;
        middle.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(second);

        return merge(left, right);

    }

    private ListNode getmiddle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    private ListNode merge(ListNode left, ListNode right){
        if(left == null) return right;
        if(right == null) return left;

        ListNode result;

        if(left.val < right.val){
            result = left;
            result.next = merge(left.next, right);
        }else {
            result = right;
            result.next = merge(left, right.next);
        }

        return result;
    }
}