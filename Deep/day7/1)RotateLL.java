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
class RotateLL {
    public ListNode rotateRight(ListNode head, int k) {

        if(head == null || head.next==null || k==0){
            return head;
        }

        int length = 1;
        ListNode curr = head;

        while(curr.next!=null){
            curr = curr.next;
            ++length;
        }
        
        k = k%length;

        int end = length - k;
        curr.next = head;

        while(end!=0){
            curr = curr.next;
            end--;
        }

        head = curr.next;
        curr.next = null;

        return head;
    }
}
