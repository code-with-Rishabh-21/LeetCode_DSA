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
    public ListNode removeNthFromEnd(ListNode head, int n) {
    
    // #### Brute Force Solution
    //     int c=0;
    //     ListNode temp;
    //     temp=head;

    //     while(temp != null) {
    //         c++;
    //         temp=temp.next;
    //     }

    //     if(c==n)
    //     {
    //        ListNode newHead = head.next;
    //         return newHead;
    //     }

    //     int len = c-n;
    //     temp = head;
        
    //     while(temp.next != null)
    //     {
    //         len--;
    //         if(len == 0) break;
    //         temp = temp.next;
    //     }
    //       temp.next= temp.next.next;

    //  return head;

    ListNode fast = head;

    for(int i = 1; i <= n ; i++) 
    fast = fast.next;

    ListNode slow = head;
    
    if(fast == null) return head.next;

    while(fast.next != null)
    {
        slow =slow.next;
        fast = fast.next;
    }
    slow.next = slow.next.next;

    return head;
    }
}