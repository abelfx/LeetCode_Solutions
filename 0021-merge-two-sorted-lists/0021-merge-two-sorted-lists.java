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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        else if(list2 == null) return list1;

        ListNode result = new ListNode(0);
        ListNode pointer = result;

        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                pointer.next = list1;
                list1 = list1.next;
            }else {
                pointer.next = list2;
                list2 = list2.next;
            }
            pointer = pointer.next;
        }

         if(list1 == null){
                pointer.next = list2;
                list2 = list2.next;
            }
            else if(list2 == null){
                pointer.next = list1;
                list1 = list1.next;
            }

        return result.next;
    
    }
}