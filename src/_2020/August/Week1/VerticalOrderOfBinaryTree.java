package _2020.August.Week1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

//https://www.programcreek.com/2014/04/leetcode-binary-tree-vertical-order-traversal-java/
public class VerticalOrderOfBinaryTree {

    public static void main(String[] args) {
        System.out.println(verticalTraversal( new TreeNode( 3,
                new TreeNode( 9 ),
                new TreeNode( 20, new TreeNode( 15 ), new TreeNode( 7 ) )) ));
    }

    /*

    public static List<List<Integer>> verticalTraversal(TreeNode root) {

    }
    static void printVertically(TreeNode root, TreeMap<Integer, LinkedList<Integer>> result, int level) {
        if (root == null) {
            return;
        }

        LinkedList<Integer> list = result.get(level);
        if (list == null) {
            list = new LinkedList<>();
        }
        list.add(root.val);
        result.put(level, list);

        printVertically(root.left, result, level-1);

        printVertically(root.right, result, level+1);
    }


*/
     // Definition for a binary tree node.
      public static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }


    public static List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null){
            return result;
        }

        int[] mm = new int[2];
        getMinMax(root, mm, 0);

        int len = mm[1]-mm[0]+1;

        for(int i=0; i<len; i++){
            result.add(new ArrayList<Integer>());
        }

        LinkedList<TreeNode> q1 = new LinkedList<>();
        LinkedList<Integer> q2 = new LinkedList<>();

        q1.offer(root);
        q2.offer(0);

        while(!q1.isEmpty()){
            TreeNode h = q1.poll();
            int order = q2.poll();

            result.get(order-mm[0]).add(h.val);

            if(h.left!=null){
                q1.offer(h.left);
                q2.offer(order-1);
            }
            if(h.right!=null){
                q1.offer(h.right);
                q2.offer(order+1);
            }
        }

        return result;
    }


    private static void getMinMax(TreeNode node, int[] mm, int order){
        if(node == null){
            return;
        }

        mm[0] = Math.min(mm[0], order);
        mm[1] = Math.max(mm[1], order);

        getMinMax(node.left, mm, order-1);
        getMinMax(node.right, mm, order+1);
    }
}

