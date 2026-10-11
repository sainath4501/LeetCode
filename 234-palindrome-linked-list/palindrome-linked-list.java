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
    public ListNode findMid(ListNode head){
        ListNode fast=head;
        ListNode slow=head;

        while(fast!=null && fast.next != null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    } 
    public boolean isPalindrome(ListNode head) {
        //basecase
        if(head==null || head.next==null){
            return true;
        }

        //step 1 find mid
        ListNode mid=findMid(head);

        //step 2 reverse 2nd half
        ListNode prev=null;
        ListNode curr=mid;
        ListNode next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        ListNode left=head;
        ListNode right=prev;

        //right==left true or false
        while(right!=null){
            if(left.val!=right.val){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;

    }
}