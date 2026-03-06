// 23. Merge k Sorted Lists

import java.util.*;
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> arr = new ArrayList<>();
        for (ListNode node : lists) {
            while (node != null) {
                arr.add(node.val);
                node = node.next;
            }
        }
        Collections.sort(arr);
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int val : arr) {
            curr.next = new ListNode(val);
            curr = curr.next;
        }

        return dummy.next;
    }
}