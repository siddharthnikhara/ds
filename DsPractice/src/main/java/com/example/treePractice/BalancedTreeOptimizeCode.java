package com.example.treePractice;

public class BalancedTreeOptimizeCode {
    Node root;
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    static class BalancedTree{
        boolean isBalanced;
        int hi;
        BalancedTree(boolean isBalanced, int hi){
            this.isBalanced=isBalanced;
            this.hi=hi;
        }

        static BalancedTree isBalancedFast(Node root){
            if(root==null){
                return new BalancedTree(true,0);
            }

            BalancedTree left = isBalancedFast(root.left);
            BalancedTree right = isBalancedFast(root.right);

            boolean leftBool = left.isBalanced;
            boolean rightBool = right.isBalanced;

            boolean rem = Math.abs(left.hi - right.hi) <= 1;
            int height = Math.max(left.hi, right.hi)+1;

            if (leftBool && rightBool && rem) {
                return new BalancedTree(true,height);
            }
            return new BalancedTree(false,0);
        }
    }
    public static void main(String[] args) {
        BalancedTreeOptimizeCode tree= new BalancedTreeOptimizeCode();
        tree.root = new Node(1);
        tree.root.left = new Node(3);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.right.right.right = new Node(8);
        tree.root.right.right.right.right = new Node(9);
        System.out.println(BalancedTree.isBalancedFast(tree.root).isBalanced);
    }
}
