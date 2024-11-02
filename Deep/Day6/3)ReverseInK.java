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
class ReverseInK {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;
        int length = 0;
        while(curr.next!=null){
            curr = curr.next;
            length = length +1;
        }
        curr = dummy;
        ListNode prevNode = dummy;
        ListNode nextNode = dummy;

        while(length>=k){
            curr = prevNode.next;
            nextNode = curr.next;
            for(int i = 1; i<k; i++){
                curr.next = nextNode.next;
                nextNode.next = prevNode.next;
                prevNode.next = nextNode;
                nextNode = curr.next;
            }
            prevNode = curr;
            length = length-k;
        }

        return dummy.next;
    }
}
