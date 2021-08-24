package _2021;

public class _0024SwapNodesInPairs {
    public static void main(String[] args) {
        ListNode l = swapPairs(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4)))));
        ListNode l1 = swapPairs(new ListNode(1, new ListNode(2, new ListNode(3))));
        while (l != null) {
            System.out.print(l.val + ", ");
            l = l.next;
        }
    }

    public static ListNode swapPairs(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return head;
        ListNode first = head, second = head.next, temp = null;
        boolean firstRound = true;
        while(true) {
            if (temp != null) temp.next = second;
            if (second != null) {
                first.next = second.next;
                second.next = first;
            }

            if (firstRound) {
                head = second;
                firstRound = false;
            }
            temp = first;
            if (first == null) break;
            first = first.next;
            if (first == null) break;
            second = first.next;
        }

        return head;
    }

     public static class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
}
