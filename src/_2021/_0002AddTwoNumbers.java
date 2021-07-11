package _2021;

public class _0002AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        ListNode l3 = addTwoNumbers(l1,l2);
        do {
            System.out.print(l3.val + ", ");
        } while ((l3 = l3.next) != null);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbers(l1, l2, 0);
    }

    private static ListNode addTwoNumbers(ListNode l1, ListNode l2, int carry) {
        ListNode listNode = new ListNode();
        int sum = 0;

        if (l1 == null && l2 == null) {
            if (carry == 0) {
                return null;
            }

            listNode.val = carry;
            listNode.next = null;
        }
        else if (l1 == null) {
            sum = l2.val + carry;
            listNode.val = sum % 10;
            listNode.next = addTwoNumbers(null, l2.next, sum / 10);
        }
        else if (l2 == null) {
            sum = l1.val + carry;
            listNode.val = sum % 10;
            listNode.next = addTwoNumbers(l1.next, null, sum / 10);
        }
        else {
            sum = l1.val + l2.val + carry;
            listNode.val = sum % 10;
            listNode.next = addTwoNumbers(l1.next, l2.next, sum / 10);
        }

        return listNode;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
