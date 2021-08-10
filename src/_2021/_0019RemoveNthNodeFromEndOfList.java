package _2021;

import com.sun.xml.internal.bind.v2.util.StackRecorder;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

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
        ListNode newListNode = head;

        ArrayList<ListNode> listNode = new ArrayList<>();
        while (newListNode != null) {
            listNode.add(newListNode);
            newListNode = newListNode.next;
        }

        System.out.println(listNode);

        int size = listNode.size();
        listNode.remove(size-n);

        ListNode result = new ListNode(listNode.get(0).val);
        ListNode headResult = result;
        for (int i = 1; i < listNode.size(); i++) {
            headResult.next = new ListNode(listNode.get(i).val);
            headResult = headResult.next;
        }

        return result;
    }

    static class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
}
