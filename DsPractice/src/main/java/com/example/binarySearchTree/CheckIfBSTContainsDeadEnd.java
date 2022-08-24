package com.example.binarySearchTree;


public class CheckIfBSTContainsDeadEnd {
    Node root;

    static class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
        }
    }

    static Node buildTree(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }
        if (root.data > val) {
            root.left = buildTree(root.left, val);
        } else {
            root.right = buildTree(root.right, val);
        }
        return root;
    }

    boolean deadEnd(Node root, int min, int max) {
        if (root == null) return false;
        if (min == max) return true;
        return deadEnd(root.left, min, root.data - 1) || deadEnd(root.right, root.data + 1, max);
    }

    public static void main(String[] args) {
        CheckIfBSTContainsDeadEnd tree = new CheckIfBSTContainsDeadEnd();
        tree.root = tree.buildTree(tree.root, 8);
        tree.buildTree(tree.root, 5);
        tree.buildTree(tree.root, 2);
        tree.buildTree(tree.root, 3);
        tree.buildTree(tree.root, 7);
        tree.buildTree(tree.root, 11);
        tree.buildTree(tree.root, 4);

        if (tree.deadEnd(tree.root, 1, Integer.MAX_VALUE) == true) {
            System.out.println("Yes ");
        } else {
            System.out.println("No ");
        }
    }
}