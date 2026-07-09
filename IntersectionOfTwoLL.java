// 160. Intersection of Two Linked Lists

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
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode posA = headA;
        ListNode posB = headB;
        while(posA != posB){
            posA = (posA == null) ? headB : posA.next;
            posB = (posB == null) ? headA : posB.next;
        }
        return posA;
    }
}