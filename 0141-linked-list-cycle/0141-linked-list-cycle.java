/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        if(head == null) return false;
        
        ListNode slownode = head;
        ListNode fastnode = head.next;
        
        while(slownode != fastnode){
            
            if(fastnode == null || fastnode.next == null) return false;
            
            slownode = slownode.next;
            fastnode = fastnode.next.next;
        }
        
        return true;
        
    }
}