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
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondH = reverse(slow);
        ListNode firstH = head;


        
        int maxtwin = 0;
        while(secondH != null){
            maxtwin = Math.max(maxtwin, firstH.val + secondH.val);
            firstH = firstH.next;
            secondH =  secondH.next;
        }

        return maxtwin;
    }

    private ListNode reverse(ListNode head){

        ListNode current = head;
        ListNode prev = null;

        while(current != null){
            ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }

        return prev;
    }
}