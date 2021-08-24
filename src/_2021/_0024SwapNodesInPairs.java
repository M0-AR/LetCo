package _2021;

// Solution by: https://www.youtube.com/watch?v=-xwX521Ija4
// Todo: See the solution again.
public class _0024SwapNodesInPairs {
    public static void main(String[] args) {
        printNodes(swapPairs(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))))));
        printNodes(swapPairs(new ListNode(1, new ListNode(2, new ListNode(3)))));

    }
    public static void printNodes(ListNode l) {
        while (l != null) {
            System.out.print(l.val + ", ");
            l = l.next;
        }
        System.out.println();
    }

    public static ListNode swapPairs(ListNode head) {
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode current = temp;

        while (current.next != null && current.next.next != null) {
            ListNode first = current.next;
            ListNode second = current.next.next;
            first.next = second.next;
            current.next = second;
            current.next.next = first;
            current = current.next.next;
        }

        return temp.next;
    }

     public static class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
}
