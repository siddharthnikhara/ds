package com.example.treePractice;

public class BalancedTree {

    Node root;

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static int height(Node node) {
        if (node == null) {
            return 0;
        }
        int left = height(node.left);
        int right = height(node.right);
        return Math.max(left, right) + 1;
    }

    static boolean isBalanced(Node root) {
        if (root == null) {
            return true;
        }
        boolean left = isBalanced(root.left);
        boolean right = isBalanced(root.right);

        boolean rem = Math.abs(height(root.left) - height(root.right)) <= 1;
        if (left && right && rem) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        BalancedTree tree = new BalancedTree();
        tree.root = new Node(1);
        tree.root.left = new Node(3);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.right.right.right = new Node(8);
        tree.root.right.right.right.right = new Node(9);
        System.out.println(isBalanced(tree.root));
    }
}
