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
class MergeTwoLL {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode l1 = list1;
        ListNode l2 = list2;
        ListNode dummy = new ListNode();
        ListNode curr = dummy;

        while(l1!=null && l2!=null){
            if(l1.val>l2.val){
                curr.next = l2;
                curr = curr.next;
                l2 = l2.next;
            }
            else{
                curr.next = l1;
                curr = curr.next;
                l1 = l1.next;
            }
        }

        if(l1!=null){
            curr.next = l1;
        }
        if(l2!=null){
            curr.next = l2;
        }

        return dummy.next;
    }
}
