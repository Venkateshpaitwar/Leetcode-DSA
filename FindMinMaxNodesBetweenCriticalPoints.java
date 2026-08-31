// 2058. Find the Minimum and Maximum Number of Nodes Between Critical Points

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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode prev = head;
        ListNode curr = head.next;
        ArrayList<Integer> list = new ArrayList<>();
        int count = 1;
        while(curr.next != null){
            count++;
            if(curr.val > prev.val && curr.val > curr.next.val){
                list.add(count);
            }else if(curr.val < prev.val && curr.val < curr.next.val){
                list.add(count);
            }
            prev = curr;
            curr = curr.next;
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        if(list.size() <= 1) return new int[]{-1, -1};
        for(int i = 1; i < list.size(); i++){
            min = Math.min(min, Math.abs(list.get(i) - list.get(i - 1)));
        }
        max = Math.abs(list.get(0) - list.get(list.size() - 1));
        return new int[]{min, max}; 
    }
}