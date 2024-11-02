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
public class CycleLLNode {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow==fast){
                break;
            }
        }
        if(fast!=null && fast.next!=null){
            fast = head;
            while(slow!=fast){
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }
        else{
            return null;
        }
    }
}