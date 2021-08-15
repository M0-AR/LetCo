package _2021;

public class _0021MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode l = mergeTwoLists(new ListNode(1, new ListNode(2, new ListNode(4))), new ListNode(1, new ListNode(3, new ListNode(4))));
        while (l != null) {
            System.out.print(l.val + ", ");
            l = l.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode merge = new ListNode(0);
        ListNode currentNode = merge;
        ListNode p1 = l1;
        ListNode p2 = l2;

        while (p1 != null && p2 != null) {

            if (p1.val < p2.val) {
                currentNode.next = p1;
                p1 = p1.next;
            } else {
                 currentNode.next = p2;
                p2 = p2.next;
            }

            currentNode = currentNode.next;
        }

        if (p1 != null) {
            currentNode.next = p1;
        }

        if (p2 != null) {
            currentNode.next = p2;
        }

        return merge.next;
    }

   static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
