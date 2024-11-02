/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class IntersectionInLL {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null){
            return headB;
        }
        if(headB==null){
            return headA;
        }

        ListNode a = headA;
        ListNode b = headB;

        while(a!=b){
            if(a!=null){
                a = a.next;
            }
            else{
                a = headB;
            }
            if(b!=null){
                b = b.next;
            }
            else{
                b = headA;
            }
        }

        return a;
    }
}
