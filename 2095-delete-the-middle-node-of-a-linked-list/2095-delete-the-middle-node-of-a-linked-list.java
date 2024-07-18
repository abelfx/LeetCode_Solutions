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
    public ListNode deleteMiddle(ListNode head) {
        ListNode current1 = head, current2 = head;
        if(current1.next == null) return null;

        int counter = 0;
        while(current1 != null){
            counter++;
            current1 = current1.next;
        }

        int middle = counter/2;

        for(int i = 0; i < middle - 1; i++) current2 = current2.next;

        current2.next = current2.next.next;

        return head;
        
    }
}