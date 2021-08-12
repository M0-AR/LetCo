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
        ListNode merge = new ListNode();
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode head = merge;

        while (p1 != null && p2 != null) {
            if (p1.val < p2.val) {
                merge.val = p1.val;
                p1 = p1.next;
                if (p2 != null) {
                    merge.next = new ListNode();
                    merge = merge.next;
                }
            } else if (p2.val < p1.val) {
                merge.val = p2.val;
                p2 = p2.next;
                if (p2 != null) {
                    merge.next = new ListNode();
                    merge = merge.next;
                }
            } else {
                merge.val = p1.val;
                p1 = p1.next;
                if (p2 != null) {
                    merge.next = new ListNode();
                    merge = merge.next;
                }
            }
        }

        while (p1 != null) {
            merge.val = p1.val;
            p1 = p1.next;
            if (p2 != null) {
                merge.next = new ListNode();
                merge = merge.next;
            }
        }

        while (p2 != null) {
            merge.val = p2.val;
            p2 = p2.next;
            if (p2 != null) {
                merge.next = new ListNode();
                merge = merge.next;
            }

        }

        return head;
    }

   static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
