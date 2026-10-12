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
    public ListNode detectCycle(ListNode head) {
         ListNode idx=head;
         ListNode slow=head;
         ListNode fast=head;

         while(fast != null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;

            if(slow==fast){
                while(idx!=slow){
                    idx=idx.next;
                    slow=slow.next;
                }
                return idx;
            }
         }
         return null;
    }
}