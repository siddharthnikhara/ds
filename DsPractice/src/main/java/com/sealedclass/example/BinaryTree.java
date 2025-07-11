//package com.sealedclass.example;
//
//import java.util.LinkedList;
//import java.util.Queue;
//
//public class BinaryTree {
//    TreeNode root;
//static class TreeNode {
//    int data;
//    TreeNode left;
//    TreeNode right;
//
//    TreeNode(int data) {
//        this.data = data;
//        this.left = null;
//        this.right = null;
//    }
//}
//  class Solution {
//    public long kthLargestLevelSum(BinaryTree root, int k) {
//        Queue<BinaryTree> q = new LinkedList();
//        int flag = 1;
//        long result = 0;
//        q.add(root);
//        q.add(null);
//        while(!q.isEmpty()){
//            BinaryTree treeNode = q.remove();
//            if(treeNode == null){
//                flag = flag+1;
//                if(q.isEmpty()){
//                    break;
//                }else{
//                    q.add(null);
//                }
//            }else {
//                if(flag == k){
//                result = result + treeNode.data;
//                }
//                if(treeNode.left != null){
//                    q.add(treeNode.left);
//                }if(treeNode.right != null)
//                {
//                    q.add(treeNode.right);
//                }
//            }
//        }
//        return result;
//    }
//
//      public static void main(String[] args) {
//          BinaryTree tree = new BinaryTree();
//          tree.root = new TreeNode(1);
//          tree.root.left = new TreeNode(2);
//          tree.root.right = new TreeNode(3);
//          tree.root.left.left = new TreeNode(4);
//          tree.root.left.right = new TreeNode(5);
//          tree.root.right.left = new TreeNode(6);
//          tree.root.right.right = new TreeNode(7);
//
//         System.out.println(kthLargestLevelSum(tree,2));
//      }
//}