package _2021;

public class _0019RemoveNthNodeFromEndOfList {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode result = removeNthFromEnd(listNode, 2);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }

    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode sHead = new ListNode(), slow = sHead, fast = sHead;
       sHead.next = head;

        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return sHead.next;
    }

    static class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
}
