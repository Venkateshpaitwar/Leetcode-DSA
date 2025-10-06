public class Merge {

    public static void main(String[] args) {
        int[] list1 = {1, 2, 4};
        int[] list2 = {1, 3, 4};

        ListNode l1 = arrayToList(list1);
        ListNode l2 = arrayToList(list2);

        ListNode merged = mergeTwoLists(l1, l2);
        
        printList(merged);
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        if (list1 != null) {
            current.next = list1;
        } else if (list2 != null) {
            current.next = list2;
        }

        return dummy.next;
    }

    public static ListNode arrayToList(int[] array) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int num : array) {
            current.next = new ListNode(num);
            current = current.next;
        }
        return dummy.next;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}
