package _2021;

// Todo: try to improve time complexity.
public class _0023MergeKSortedLists {
    public static void main(String[] args) {
        ListNode l = mergeKLists(new ListNode[]{new ListNode(1, new ListNode(4, new ListNode(5))),
                                                      new ListNode(1, new ListNode(3, new ListNode(4))),
                                                      new ListNode(2, new ListNode(6)) });

        while (l != null) {
            System.out.print(l.val + ", ");
            l = l.next;
        }
    }


    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        if (lists.length == 1) return lists[0];
        ListNode listNodes = new ListNode();
        for (int i = 0; i < lists.length - 1; i++) {
            if (i == 0)
                listNodes = mergeTwoSortedList(lists[i], lists[i + 1]);
            else
                listNodes = mergeTwoSortedList(listNodes, lists[i + 1]);
        }
        return listNodes;
    }

    private static ListNode mergeTwoSortedList(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode currentNode = head;

        while (l1 != null && l2 != null) {

            if (l1.val < l2.val) {
                currentNode.next = l1;
                l1 = l1.next;
            } else {
                currentNode.next = l2;
                l2 = l2.next;
            }

            currentNode = currentNode.next;
        }

        if (l1 != null) {
            currentNode.next = l1;
        }

        if (l2 != null) {
            currentNode.next = l2;
        }

        return head.next;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

}
