package _2021;
/**
 * Thoughts before coding:
 *  - Find the length 'n' of a linked list,
 *  to clarify the length of reverse linked list.
 *      - If 'n' modulus by 'k' == 0 this mean that all
 *        the linked list should be reverse by 'k'.
 *
 *  Answer:
 *      - Create a method 'findLengthOfLinkedList' to find the length of a linked list.
 *      - Find a value of 'reveresLength' that clarify the nodes should be reversed,
 *          - remainingToReversLength = 'n' - ('n' modulus 'k')
 *      - Create a method 'remainingToReversLength', which return the part of linked list that should be reverse.
 *      - Create a method 'reverse' to reverse take two inputs pointer of linked list 'head' and number of reverse 'k'.
 *
 *  Time and space complexity:
 *      - Time complexity: O(n), where n equal to the length of Linked list
 *          - O(n), visit each node once.
 *      - Space complexity:
 */
public class _0025ReverseNodesInKGroup {
    public static void main(String[] args) {
        printNodes(reverseKGroup(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))), 2));
        printNodes(reverseKGroup(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))), 3));
        printNodes(reverseKGroup(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))), 1));
        printNodes(reverseKGroup(new ListNode(1), 1));
    }
    public static void printNodes(ListNode l) {
        while (l != null) {
            System.out.print(l.val + ", ");
            l = l.next;
        }
        System.out.println();
    }

    public static ListNode reverseKGroup(ListNode head, int k) {
        int n = findLengthOfLinkedList(head);

        int modulus = n % k;

        // Todo Continue from here.
        ListNode subLinkedList = remainingToReversLength(head, n - modulus);
        return null;
    }

    private static int findLengthOfLinkedList(ListNode head) {
        return 1 + ((head != null) ? findLengthOfLinkedList(head.next) : -1);
    }

    private static ListNode remainingToReversLength(ListNode head, int n) {

        return null;
    }




    public static class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
}
