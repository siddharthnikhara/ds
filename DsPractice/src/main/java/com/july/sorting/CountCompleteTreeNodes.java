package com.july.sorting;

public class CountCompleteTreeNodes {

    public static int countNodes(TreeNode root) {
        if(root == null){
            return 0;
        }
        int leftCount = countNodes(root.left);
        int rightCount =  countNodes(root.right);
        return leftCount + rightCount+1;
    }

    public static void main(String[] args) {
        TreeNode node =  new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(4);
        node.left.right =  new TreeNode(5);
        node.right.left =  new TreeNode(6);
        node.right.right =  new TreeNode(7);
        System.out.println(countNodes(node));
    }
}




  class TreeNode {
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
